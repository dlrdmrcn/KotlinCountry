package com.dilara.kotlincountry.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.dilara.kotlincountry.R
import com.dilara.kotlincountry.databinding.ItemCountryBinding
import com.dilara.kotlincountry.model.Country

class CountryAdapter (val countryList: ArrayList<Country>) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>(){

    class CountryViewHolder(val view : ItemCountryBinding) :RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemCountryBinding>(inflater,R.layout.item_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
//        holder.view.name.text = countryList(position).countryName
//        holder.view.region.text = countryList(position).countryRegion
//        holder.view..setOnClickListener{val action  = FeedFragmentDirections.actionFeedFragmentToCountryFragment()
//    Navigation.findNavController(it).navigate(action)}



    }

    fun updateCountryList(newCountryList: List<Country>){
        countryList.clear()
        countryList.addAll(newCountryList)
        notifyDataSetChanged()
    }
}