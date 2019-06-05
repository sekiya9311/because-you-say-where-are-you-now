package com.sekiya9311.becauseyousaywhereareyounow.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddress
import com.sekiya9311.becauseyousaywhereareyounow.model.interfaces.MailSettingService
import com.sekiya9311.becauseyousaywhereareyounow.viewmodel.DestSettingViewModel
import java.lang.IllegalArgumentException

class DestSettingViewModelFactory(
    private val srcMailAddress: SourceMailAddress,
    private val mailSettingService: MailSettingService
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DestSettingViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return DestSettingViewModel(srcMailAddress, mailSettingService) as T
        }
        throw  IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}
