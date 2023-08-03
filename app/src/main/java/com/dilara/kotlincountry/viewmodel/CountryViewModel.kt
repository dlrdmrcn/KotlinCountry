package com.dilara.kotlincountry.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dilara.kotlincountry.model.Country

class CountryViewModel : ViewModel() {
    val countryLiveData = MutableLiveData<Country>()

    fun getDataFromRoom() {
        val country = Country("Turkey", "Asia", "Ankara","TRY","Turkish","www.sd.com")
        countryLiveData.value = country
    }
}