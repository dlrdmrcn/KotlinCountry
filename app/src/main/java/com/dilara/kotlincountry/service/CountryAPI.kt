package com.dilara.kotlincountry.service

import com.dilara.kotlincountry.model.Country
import io.reactivex.Single
import retrofit2.http.GET

interface CountryAPI {

    //Base Url -> https://raw.githubusercontent.com/
    //EXT -> atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json

    @GET("atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json")
    fun getCountries():Single<List<Country>>
}