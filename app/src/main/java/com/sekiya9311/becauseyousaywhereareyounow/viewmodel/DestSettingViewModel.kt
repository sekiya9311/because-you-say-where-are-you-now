package com.sekiya9311.becauseyousaywhereareyounow.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import com.sekiya9311.becauseyousaywhereareyounow.entity.DestSetting
import com.sekiya9311.becauseyousaywhereareyounow.model.SettingRepository

class DestSettingViewModel : ViewModel() {
    private val repository = SettingRepository()

    val destSettings = MutableLiveData<List<DestSetting>>()

    init {
        destSettings.postValue(repository.destSetting)
    }
}
