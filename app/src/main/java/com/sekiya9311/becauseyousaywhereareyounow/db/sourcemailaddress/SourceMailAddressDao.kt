package com.sekiya9311.becauseyousaywhereareyounow.db.sourcemailaddress

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SourceMailAddressDao {

    @Insert
    fun insert(record: SourceMailAddress)

    @Delete
    fun delete(record: SourceMailAddress)

    @Query("SELECT * FROM source_mail_addresses WHERE id=:id LIMIT 1")
    fun fetch(id: Int): SourceMailAddress

    @Query("SELECT * FROM source_mail_addresses LIMIT 1")
    fun fetch(): SourceMailAddress

}
