package com.example.find_my_hotel.hotel

import android.graphics.BitmapFactory
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.find_my_hotel.R

class HotelListItemHolder(itemView: View, private var clickListener: OnHotelItemClickListener) :
    RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var hotelImage: ImageView
    var hotelNameText: TextView
    var hotelAddressText: TextView
    var reviewersCountText: TextView
    var averagePointText: TextView

    lateinit var hotel: Hotel

    init {
        hotelImage = itemView.findViewById(R.id.imageViewHotelPicture)
        hotelNameText = itemView.findViewById(R.id.textViewHotelName)
        hotelAddressText = itemView.findViewById(R.id.textViewAddress)
        reviewersCountText = itemView.findViewById(R.id.textViewReviewersCount)
        averagePointText = itemView.findViewById(R.id.textViewAveragePoint)
    }

    fun bindHotelItem(hotel: Hotel) {
        val context = itemView.context
        val imageBitmap = BitmapFactory.decodeResource(context.resources, hotel.imageResourceId)
        this.hotel = hotel
        hotelImage.setImageBitmap(imageBitmap)
        hotelNameText.text = hotel.name
        hotelAddressText.text = hotel.address
        reviewersCountText.text = hotel.totalNumberofReviews.toString()
        averagePointText.text = hotel.averageScore.toString()
        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        clickListener.onHotelClick(hotel)
    }
}