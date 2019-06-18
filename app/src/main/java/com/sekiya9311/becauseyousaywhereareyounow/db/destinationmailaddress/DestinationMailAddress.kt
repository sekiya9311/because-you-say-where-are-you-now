package com.sekiya9311.becauseyousaywhereareyounow.db.destinationmailaddress

import androidx.room.Entity
import androidx.room.Index
import androidx.room.ForeignKey
import androidx.room.ColumnInfo
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddress

@Entity(
    tableName = "destination_mail_addresses",
    indices = [Index(value = ["source_mail_address_id"])],
    primaryKeys = ["source_mail_address_id", "mail_address"],
    foreignKeys = [
        ForeignKey(
            entity = SourceMailAddress::class,
            parentColumns = ["id"],
            childColumns = ["source_mail_address_id"],
            onDelete = ForeignKey.CASCADE
        )
    ])
data class DestinationMailAddress(
    @ColumnInfo(name = "source_mail_address_id") val sourceMailAddressId: Int,
    @ColumnInfo(name = "mail_address") val mailAddress: String,
    @ColumnInfo(name = "job_id") val jobId: Int,
    val interval: Int
)
