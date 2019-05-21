package com.sekiya9311.becauseyousaywhereareyounow.db.sendtime

import androidx.room.*
import com.sekiya9311.becauseyousaywhereareyounow.db.destinationmailaddress.DestinationMailAddress
import java.util.Date

@Entity(
    tableName = "send_times",
    primaryKeys = ["destination_mail_address_id", "send_timestamp"],
    indices = [Index(value = ["destination_mail_address_id"])],
    foreignKeys = [
        ForeignKey(
            entity = DestinationMailAddress::class,
            parentColumns = ["id"],
            childColumns = ["destination_mail_address_id"],
            onDelete = ForeignKey.CASCADE
        )
    ])
data class SendTime(
    @ColumnInfo(name = "destination_mail_address_id") val destinationMailAddressId: Int,
    @ColumnInfo(name = "send_timestamp") val sendTimestamp: Date,
    val enable: Boolean
)
