package com.sekiya9311.becauseyousaywhereareyounow.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.sekiya9311.becauseyousaywhereareyounow.db.destinationmailaddress.DestinationMailAddress
import com.sekiya9311.becauseyousaywhereareyounow.db.destinationmailaddress.DestinationMailAddressDao
import com.sekiya9311.becauseyousaywhereareyounow.db.sendtime.SendTime
import com.sekiya9311.becauseyousaywhereareyounow.db.sendtime.SendTimeDao
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddress
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddressDao

@Database(
    entities = [
        SourceMailAddress::class,
        DestinationMailAddress::class,
        SendTime::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun sourceMailAddressDao(): SourceMailAddressDao
    abstract fun destinationMailAddressDao(): DestinationMailAddressDao
    abstract fun sendTimeDao(): SendTimeDao
}
