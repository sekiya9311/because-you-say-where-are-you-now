package com.sekiya9311.becauseyousaywhereareyounow.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sekiya9311.becauseyousaywhereareyounow.db.destinationmailaddress.DestinationMailAddress
import com.sekiya9311.becauseyousaywhereareyounow.db.destinationmailaddress.DestinationMailAddressDao
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddress
import com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress.SourceMailAddressDao

@Database(
    entities = [
        SourceMailAddress::class,
        DestinationMailAddress::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun sourceMailAddressDao(): SourceMailAddressDao
    abstract fun destinationMailAddressDao(): DestinationMailAddressDao
}
