package com.sekiya9311.becauseyousaywhereareyounow.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.sekiya9311.becauseyousaywhereareyounow.R
import com.sekiya9311.becauseyousaywhereareyounow.viewmodel.DestSettingViewModel

class DestSettingFragment : Fragment() {

    companion object {
        fun newInstance() = DestSettingFragment()
    }

    private lateinit var viewModel: DestSettingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dest_setting_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DestSettingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
