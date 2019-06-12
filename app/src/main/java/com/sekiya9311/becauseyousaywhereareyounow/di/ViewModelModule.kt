package com.sekiya9311.becauseyousaywhereareyounow.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sekiya9311.becauseyousaywhereareyounow.viewmodel.DestSettingViewModel
import com.sekiya9311.becauseyousaywhereareyounow.viewmodel.SendSettingViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(
        factory: ViewModelFactory
    ): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(DestSettingViewModel::class)
    fun bindDestSettingViewModel(
        destSettingViewModel: DestSettingViewModel
    ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SendSettingViewModel::class)
    fun bindSendSettingViewModel(
        sendSettingViewModel: SendSettingViewModel
    ): ViewModel
}
