package com.sekiya9311.becauseyousaywhereareyounow.db.destinationmailaddress

import androidx.room.*
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddress

@Entity(
    tableName = "destination_mail_addresses",
    indices = [Index(value = ["source_mail_address_id"])],
    foreignKeys = [
        ForeignKey(
            entity = SourceMailAddress::class,
            parentColumns = ["id"],
            childColumns = ["source_mail_address_id"],
            onDelete = ForeignKey.CASCADE
        )
    ])
data class DestinationMailAddress(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "source_mail_address_id") val sourceMailAddressId: Int,
    @ColumnInfo(name = "mail_address") val mailAddress: String
)
