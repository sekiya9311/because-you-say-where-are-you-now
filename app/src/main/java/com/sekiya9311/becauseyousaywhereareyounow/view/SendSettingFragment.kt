package com.sekiya9311.becauseyousaywhereareyounow.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.sekiya9311.becauseyousaywhereareyounow.R
import com.sekiya9311.becauseyousaywhereareyounow.viewmodel.SendSettingViewModel

class SendSettingFragment : Fragment() {

    companion object {
        fun newInstance() = SendSettingFragment()
    }

    private lateinit var viewModel: SendSettingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.send_setting_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SendSettingViewModel::class.java)

        arguments?.run {
            val selectedDestPos = SendSettingFragmentArgs.fromBundle(this).destinationMailAddressId
            if (selectedDestPos > -1) {
                viewModel.selectedDestinationMailAddressId = selectedDestPos
            }
        } ?: return
    }
}
