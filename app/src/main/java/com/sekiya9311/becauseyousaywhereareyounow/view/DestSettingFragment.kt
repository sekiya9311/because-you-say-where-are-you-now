package com.sekiya9311.becauseyousaywhereareyounow.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation

import com.sekiya9311.becauseyousaywhereareyounow.R
import com.sekiya9311.becauseyousaywhereareyounow.databinding.DestSettingListItemBinding
import com.sekiya9311.becauseyousaywhereareyounow.databinding.DestSettingFragmentBinding
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddress
import com.sekiya9311.becauseyousaywhereareyounow.entity.DestSetting
import com.sekiya9311.becauseyousaywhereareyounow.model.MailSettingServiceImpl
import com.sekiya9311.becauseyousaywhereareyounow.viewmodel.DestSettingViewModel
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.databinding.BindableItem
import com.xwray.groupie.databinding.ViewHolder
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class DestSettingFragment : DaggerFragment() {

    companion object {
        fun newInstance() = DestSettingFragment()
    }

    private lateinit var binding: DestSettingFragmentBinding

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: DestSettingViewModel by lazy {
        ViewModelProviders
            .of(this, viewModelFactory)
            .get(DestSettingViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.dest_setting_fragment,
            container,
            false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.apply {
            mailSettingService = MailSettingServiceImpl()
            srcMailAddress = SourceMailAddress(0, "")
        }

        val groupAdapter = GroupAdapter<ViewHolder<*>>()
        binding.recyclerView.adapter = groupAdapter

        viewModel.destSettings.observe(viewLifecycleOwner, Observer { setting ->
            val convertedDestSettings = setting.map { DisplayItemOfDestSetting(it) }
            groupAdapter.update(convertedDestSettings)
        })
    }

    class DisplayItemOfDestSetting(
        private val item : DestSetting
    ) : BindableItem<DestSettingListItemBinding>() {
        override fun getLayout(): Int = R.layout.dest_setting_list_item
        override fun bind(itemBinding: DestSettingListItemBinding, pos: Int) {
            itemBinding.srcMailAddress = item.srcMailAddress

            itemBinding.root.setOnClickListener { view ->
                Navigation.findNavController(view).navigate(
                    DestSettingFragmentDirections
                        .actionDestSettingFragmentToSendSettingFragment().apply {
                            destinationMailAddressId = pos
                        }
                )
            }
        }
    }
}
