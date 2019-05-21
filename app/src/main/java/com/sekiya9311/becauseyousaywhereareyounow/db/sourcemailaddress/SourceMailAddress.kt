package com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "source_mail_addresses")
data class SourceMailAddress(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "mail_address") val mailAddress: String
)
