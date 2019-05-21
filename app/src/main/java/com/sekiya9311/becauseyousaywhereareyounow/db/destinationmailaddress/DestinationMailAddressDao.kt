package com.sekiya9311.becauseyousaywhereareyounow.db.destinationmailaddress

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DestinationMailAddressDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(record: DestinationMailAddress)

    @Delete
    fun delete(record: DestinationMailAddress)

    @Query("SELECT * FROM destination_mail_addresses WHERE source_mail_address_id = :sourceMailAddressId")
    fun destinationMailAddressesLiveData(sourceMailAddressId: Int): LiveData<List<DestinationMailAddress>>

}
