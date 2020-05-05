package com.example.find_my_hotel.review


data class Review(
    val reviewID: Int,
    val hotelName: String,
    var negativeReview: String,
    var positiveReview: String,
    var score: Double,
    var reviewedAt: String,
    var reviewerNationality: String,
    var totalNumberofReviews: Int
)
