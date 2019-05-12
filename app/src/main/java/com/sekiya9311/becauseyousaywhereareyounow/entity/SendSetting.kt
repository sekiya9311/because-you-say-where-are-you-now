package com.sekiya9311.becauseyousaywhereareyounow.entity

import java.util.Date

data class SendSetting(
    val destMailAddress: String,
    val sendTimes: List<Date>
)
