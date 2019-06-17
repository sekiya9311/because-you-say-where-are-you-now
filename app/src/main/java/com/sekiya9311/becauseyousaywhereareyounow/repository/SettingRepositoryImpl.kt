package com.sekiya9311.becauseyousaywhereareyounow.repository

import com.sekiya9311.becauseyousaywhereareyounow.entity.DestSetting
import com.sekiya9311.becauseyousaywhereareyounow.repository.interfaces.SettingRepository

class SettingRepositoryImpl : SettingRepository {
    override val destSetting: List<DestSetting> by lazy {
        // TODO: impl
        throw NotImplementedError()
    }
}
