package com.sekiya9311.becauseyousaywhereareyounow.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddress
import com.sekiya9311.becauseyousaywhereareyounow.entity.DestSetting
import com.sekiya9311.becauseyousaywhereareyounow.model.interfaces.MailSettingService
import javax.inject.Inject

class DestSettingViewModel @Inject constructor() : ViewModel() {

    lateinit var srcMailAddress: SourceMailAddress
    lateinit var mailSettingService: MailSettingService

    val destSettings = MutableLiveData<List<DestSetting>>()

    init {

    }
}
