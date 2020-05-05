package com.example.find_my_hotel.review

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.find_my_hotel.R
import com.example.find_my_hotel.constants.REVIEW_LIST_HOTEL_NAME_ARG

class ReviewListActivity : AppCompatActivity(){

    private lateinit var reviewListRecyclerView: RecyclerView
    private lateinit var reviewListAdapter: ReviewListAdapter
    private lateinit var hotelNameText: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hotel_reviews)
        val hotelName = intent.getStringExtra(REVIEW_LIST_HOTEL_NAME_ARG)
        val reviews = getReviews().filter { review ->  review.hotelName == hotelName};
        reviewListRecyclerView = findViewById(R.id.review_list)
        hotelNameText = findViewById(R.id.hotel_name)
        reviewListAdapter = ReviewListAdapter(reviews)
        reviewListRecyclerView.adapter = reviewListAdapter
        reviewListRecyclerView.layoutManager = LinearLayoutManager(this)
        hotelNameText.text = hotelName
    }

    private fun getReviews(): ArrayList<Review> {
        val reviews = ArrayList<Review>()
        reviews.add(
            Review(
                1, "Hotel Arena", " I am so angry that i made this post available" +
                        " via all possible sites i use when planing my trips so no one will make the mistake of booking " +
                        "this place. I made my booking via 'booking.com'. We stayed for 6 nights in this hotel from 11 to 17" +
                        " July Upon arrival we were placed in a small room on the 2nd floor of the hotel. It turned out that" +
                        " this was not the room we booked. I had specially reserved the 2 level duplex room so that we would" +
                        " have a big windows and high ceilings. The room itself was ok if you don t mind the broken window" +
                        " that can not be closed hello rain and a mini fridge that contained some sort of a bio weapon at" +
                        " least i guessed so by the smell of it. I intimately asked to change the room and after explaining" +
                        " 2 times that i booked a duplex btw it costs the same as a simple double but got way more volume" +
                        " due to the high ceiling was offered a room but only the next day. SO i had to check out the next" +
                        " day before 11 o clock in order to get the room i waned to Not the best way to begin your holiday." +
                        " So we had to wait till 13 00 in order to check in my new room what a wonderful waist of my time." +
                        " The room 023 i got was just as i wanted to peaceful internal garden view big window. We were tired" +
                        " from waiting the room so we placed our belongings and rushed to the city. In the evening it turned" +
                        " out that there was a constant noise in the room i guess it was made by vibrating vent tubes or" +
                        " something it was constant and annoying as hell AND it did not stop even at 2 am making it hard" +
                        " to fall asleep for me and my wife. I have an audio recording that i can not attach here but if you" +
                        " want i can send it via e-mail. The next day the technician came but was not able to determine the" +
                        " cause of the disturbing sound so i was offered to change the room once again the hotel was fully" +
                        " booked and they had only 1 room left the one that was smaller but seems newer.",
                "Only the park outside of the hotel was beautiful.", 2.9, "08/03/2017",
                "Russia", 7
            )
        )

        reviews.add(
            Review(
                2,
                "The Rembrandt",
                "The room which was booked as superior twin" +
                        " was a bit too small.",
                "Year after year I am staying in Rembrandt hotel due to its " +
                        "excellent location friendly staff good room views.",
                9.6,
                "1/3/2016",
                " United Kingdom",
                10
            )
        )

        reviews.add(
            Review(
                3, "Radisson Blu Edwardian Grafton", "No Negative",
                "Near tube station Excellent service Staff very welcoming Lovely hotel",
                10.0, "1/1/2016", "United Kingdom", 1
            )
        )

        reviews.add(
            Review(
                4, "Mercure Paris Gare De Lyon TGV", "No Negative",
                "Good location right at Gare du Lyon.", 8.3, "6/6/2016",
                "Australia", 22
            )
        )

        reviews.add(
            Review(
                5, "Villa Montparnasse", "The decor is tired and shabby" +
                        " chipped furnitures and bathtub stained wall paper and carpet. No room service and breakfast" +
                        " is expensive for what it is. There is no way this hotel is a 4 stars Look somewhere else.",
                "	 Central location polite staff", 5.0, "4/5/2016",
                "United Kingdom", 1
            )
        )

        reviews.add(
            Review(
                6,
                "Holiday Inn London Kensington Forum",
                "It was still quite" +
                        " expensive. The water pressure in the shower was quite weak.",
                "The reception staff" +
                        " was awesome. They were very friendly and accommodating. The gym was nice and the location was close to" +
                        " major destinations Thanks for the free water and kit kat bars.",
                9.2,
                "7/9/2016",
                "USA",
                6
            )
        )

        reviews.add(
            Review(
                7,
                "Atlantis Hotel Vienna",
                "No Negative",
                "Helpful staff allowed me to check in early as i arrived before the check in time",
                10.0,
                "9/6/2015",
                "Kuwait",
                6
            )
        )

        reviews.add(
            Review(
                8, "Hotel Da Vinci", "Very unfriendly staffs",
                "Nice decor", 5.8, "3/9/2017", "Hong Kong", 5
            )
        )
        reviews.add(
            Review(
                9, "Glam Milano", "small ordinary selection of food breakfast",
                "No Positive", 7.5, "1/9/2017", "United Kingdom", 3
            )
        )
        reviews.add(
            Review(
                10, "Park Plaza Vondelpark Amsterdam", "All was good",
                "the stuff the location the biks", 10.0, "7/4/2016",
                "United Kingdom", 1
            )
        )
        reviews.add(
            Review(
                11, "Grand Hotel Wien", "Had to wait for our room",
                "No Positive", 9.5, "9/9/2015", "USA",
                11
            )
        )
        reviews.add(
            Review(
                12, "Best Western Premier Hotel Couture", "The services were" +
                        " not typical of a 4 star hotel Apart from one or two people at the reception the rest of the staff did not" +
                        " seem willing to help at times and disappeared quickly when they suspected that you need to ask something",
                "I loved the accomodation super clean and modern", 7.9, "1/3/2016",
                "Germany", 13
            )
        )
        reviews.add(
            Review(
                13, "NH Grand Hotel Krasnapolsky", "Nothing",
                "Right on the doorstep of everything", 7.5, "4/5/2017",
                "United Kingdom", 2
            )
        )
        reviews.add(
            Review(
                14, "Steigenberger Hotel Herrenhof",
                "Nothing", "Everything", 9.6, "1/1/2017",
                "Turkey", 25
            )
        )
        reviews.add(
            Review(
                15,
                "Hotel Arena",
                "The aircondition makes so much noise" +
                        " and its hard to sleep at night",
                "The room was big enough and the bed is good The breakfast food and service" +
                        " on the hotel is good outside the hotel there is a big park which is very good for walk in the morning" +
                        " and evening Many people are having picnics and do some bicycling",
                7.9,
                "7/8/2017",
                "Norway",
                1
            )
        )
        return reviews
    }
}
