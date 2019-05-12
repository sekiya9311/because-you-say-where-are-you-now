package com.sekiya9311.becauseyousaywhereareyounow.entity

data class DestSetting(
    val srcMailAddress: String,
    val destSettings: List<SendSetting>
)
