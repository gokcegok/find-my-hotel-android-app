package com.example.find_my_hotel.hotel

data class Hotel(
    val hotelImage: String,
    val imageResourceId: Int,
    val hotelID: Int,
    var name: String,
    var address: String,
    var averageScore: Double,
    var totalNumberofReviews: Int,
    var latitude: Double,
    var longitude: Double
)
