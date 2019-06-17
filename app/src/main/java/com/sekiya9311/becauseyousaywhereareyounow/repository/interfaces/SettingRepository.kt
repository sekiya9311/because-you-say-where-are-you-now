package com.sekiya9311.becauseyousaywhereareyounow.repository.interfaces

import com.sekiya9311.becauseyousaywhereareyounow.entity.DestSetting

interface SettingRepository {
    val destSetting: List<DestSetting>
}
