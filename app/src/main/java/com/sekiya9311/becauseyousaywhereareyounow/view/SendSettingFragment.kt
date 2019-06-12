package com.sekiya9311.becauseyousaywhereareyounow.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import com.sekiya9311.becauseyousaywhereareyounow.R
import com.sekiya9311.becauseyousaywhereareyounow.viewmodel.SendSettingViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SendSettingFragment : DaggerFragment() {

    companion object {
        fun newInstance() = SendSettingFragment()
    }

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: SendSettingViewModel by lazy {
        ViewModelProviders
            .of(this, viewModelFactory)
            .get(SendSettingViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.send_setting_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        arguments?.run {
            val selectedDestPos = SendSettingFragmentArgs.fromBundle(this).destinationMailAddressId
            if (selectedDestPos > -1) {
                viewModel.selectedDestinationMailAddressId = selectedDestPos
            }
        } ?: return
    }
}
