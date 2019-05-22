package com.sekiya9311.becauseyousaywhereareyounow.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import com.sekiya9311.becauseyousaywhereareyounow.entity.DestSetting
import com.sekiya9311.becauseyousaywhereareyounow.model.interfaces.MailSettingService
import com.sekiya9311.becauseyousaywhereareyounow.model.interfaces.SettingRepository

class DestSettingViewModel(mailSettingService: MailSettingService) : ViewModel() {

    val destSettings = MutableLiveData<List<DestSetting>>()

    init {

    }
}
