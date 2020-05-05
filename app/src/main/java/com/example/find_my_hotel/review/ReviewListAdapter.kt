package com.example.find_my_hotel.review

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.find_my_hotel.R


class ReviewListAdapter(private var reviewList: List<Review>) :
    RecyclerView.Adapter<ReviewListItemHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewListItemHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.review_list_item, parent, false)
        return ReviewListItemHolder(itemView)
    }


    override fun getItemCount(): Int {
        //android.util.Log.d("Review List Size", reviewList.size.toString())
        return reviewList.size
    }

    override fun onBindViewHolder(holder: ReviewListItemHolder, position: Int) {
        holder.bindReviewItem(reviewList[position])
    }



}