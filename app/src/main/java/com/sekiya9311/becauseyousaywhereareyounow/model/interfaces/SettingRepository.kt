package com.sekiya9311.becauseyousaywhereareyounow.model.interfaces

import com.sekiya9311.becauseyousaywhereareyounow.entity.DestSetting

interface SettingRepository {
    val destSetting: List<DestSetting>
}
