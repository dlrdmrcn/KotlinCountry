package com.dilara.kotlincountry.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.dilara.kotlincountry.model.Country

@Dao
interface CountryDao {
    //Data Access Object

    @Insert
    suspend fun insertAll(vararg countries :Country ): List<Long>

    @Query (" SELECT * FROM country")
    suspend fun getAllCountries() : List<Country>

    @Query ("SELECT * FROM country WHERE uuid = :countryId")
    suspend fun getCountry(countryId : Int) : Country

    @Query("DELETE FROM country")
    suspend fun deleteAllCountries()
}