package com.sekiya9311.becauseyousaywhereareyounow.db.sendtime

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SendTimeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(record: SendTime)

    @Delete
    fun delete(record: SendTime)

    @Query("SELECT * FROM send_times WHERE destination_mail_address_id = :destinationMailAddressId")
    fun sendTimesLiveData(destinationMailAddressId: Int): LiveData<List<SendTime>>

}
