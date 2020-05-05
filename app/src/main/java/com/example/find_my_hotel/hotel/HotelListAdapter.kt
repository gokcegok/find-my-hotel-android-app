package com.example.find_my_hotel.hotel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.find_my_hotel.R


class HotelListAdapter(private var hotelList: List<Hotel>, private var hotelClickListener: OnHotelItemClickListener) :
    RecyclerView.Adapter<HotelListItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelListItemHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.hotel_list_item, parent, false)
        return HotelListItemHolder(itemView, hotelClickListener)
    }


    override fun getItemCount(): Int {
        //Log.i(" Hotel size", hotelList.size.toString())
        return hotelList.size
    }

    override fun onBindViewHolder(holder: HotelListItemHolder, position: Int) {
        holder.bindHotelItem(hotelList[position])
    }



}