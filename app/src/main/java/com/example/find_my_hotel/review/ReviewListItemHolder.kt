package com.example.find_my_hotel.review

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.find_my_hotel.R

class ReviewListItemHolder(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    var reviewerScore: TextView
    var totalNumberofReviews: TextView
    var reviewerNationality: TextView
    var reviewDate: TextView
    var negativeReview: TextView
    var positiveReview: TextView


    lateinit var review: Review

    init {
        reviewerScore = itemView.findViewById(R.id.reviewer_score)
        totalNumberofReviews = itemView.findViewById(R.id.number_of_reviews)
        reviewerNationality = itemView.findViewById(R.id.nationality)
        reviewDate = itemView.findViewById(R.id.date)
        negativeReview = itemView.findViewById(R.id.negative_review)
        positiveReview = itemView.findViewById(R.id.positive_review)
    }

    fun bindReviewItem(review: Review) {
        this.review = review

        reviewerScore.text = review.score.toString()
        totalNumberofReviews.text = review.totalNumberofReviews.toString()
        reviewerNationality.text = review.reviewerNationality
        reviewDate.text = review.reviewedAt
        negativeReview.text = review.negativeReview
        positiveReview.text = review.positiveReview
    }

}
