package com.example.find_my_hotel.hotel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.find_my_hotel.R
import com.example.find_my_hotel.constants.HOTEL_LIST_COUNTRY_ARG
import com.example.find_my_hotel.constants.REVIEW_LIST_HOTEL_NAME_ARG
import com.example.find_my_hotel.review.ReviewListActivity
import kotlinx.android.synthetic.main.hotel_reviews.*

class HotelListActivity : AppCompatActivity(), OnHotelItemClickListener {

    private lateinit var hotelListRecyclerView: RecyclerView
    private lateinit var hotelListAdapter: HotelListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hotels)
        val hotelCountry = intent.getStringExtra(HOTEL_LIST_COUNTRY_ARG)
        val hotels = getHotels().filter { hotel -> hotelCountry == hotel.address }
        hotelListRecyclerView = findViewById(R.id.hotel_list)
        hotelListAdapter = HotelListAdapter(hotels, this)
        hotelListRecyclerView.adapter = hotelListAdapter
        hotelListRecyclerView.layoutManager = LinearLayoutManager(this)


    }

    private fun getHotels(): ArrayList<Hotel> {
        val hotels = ArrayList<Hotel>()
        hotels.add(
            Hotel(
                "hotel_arena.jpg", R.drawable.hotel_arena,
                1, "Hotel Arena", "Netherlands", 7.7, 1403,
                52.3605759, 4.9159683
            )
        )
        hotels.add(
            Hotel(
                "rembrandt.jpg", R.drawable.rembrandt,
                2, "The Rembrandt", "United Kingdom", 8.5, 1802,
                51.4959227, -0.1702917
            )
        )
        hotels.add(
            Hotel(
                "radisson_blu.jpg", R.drawable.radisson_blu,
                3, "Radisson Blu Edwardian Grafton", "United Kingdom", 8.3,
                2826, 51.5241386, -0.1380807
            )
        )
        hotels.add(
            Hotel(
                "mercure_paris.jpg", R.drawable.mercure_paris,
                4, "Mercure Paris Gare De Lyon TGV", "France", 7.9,
                2903, 48.8442949, 2.3730938
            )
        )
        hotels.add(
            Hotel(
                "villa_montparnasse.jpg", R.drawable.villa_montparnasse,
                5, "Villa Montparnasse", "France", 7.6, 300,
                48.8349272, 2.3295913
            )
        )
        hotels.add(
            Hotel(
                "holiday_inn.jpg", R.drawable.holiday_inn,
                6, "Holiday Inn London Kensington Forum", "United Kingdom", 7.8,
                3867, 51.4942305, -0.1851141
            )
        )
        hotels.add(
            Hotel(
                "atlantis_hotel.jpg", R.drawable.atlantis_hotel,
                7, "Atlantis Hotel Vienna", "Austria", 8.1, 2823,
                48.2037451, 16.3356767
            )
        )
        hotels.add(
            Hotel(
                "hotel_da_vinci.jpg", R.drawable.hotel_da_vinci,
                8, "Hotel Da Vinci", "Italy", 8.1, 16670,
                45.5331372, 9.1711019
            )
        )
        hotels.add(
            Hotel(
                "glam_milano.jpg", R.drawable.glam_milano,
                9, "Glam Milano", "Italy", 8.8, 7371,
                45.4838504, 9.2034067
            )
        )
        hotels.add(
            Hotel(
                "park_plaza.jpg", R.drawable.park_plaza,
                10, "Park Plaza Vondelpark Amsterdam", "Netherlands", 7.5, 2176,
                52.3542655, 4.8664365
            )
        )
        hotels.add(
            Hotel(
                "grand_hotel.jpg", R.drawable.grand_hotel,
                11, "Grand Hotel Wien", "Austria", 9.0, 1375,
                48.2021105, 16.3720841
            )
        )
        hotels.add(
            Hotel(
                "best_western.jpg", R.drawable.best_western,
                12, "Best Western Premier Hotel Couture", "Netherlands", 8.7, 8177,
                52.3511137, 4.8411629
            )
        )
        hotels.add(
            Hotel(
                "nh_collection.jpg", R.drawable.nh_collection,
                13, "NH Grand Hotel Krasnapolsky", "Netherlands", 8.4,
                4686, 52.3727067, 4.8943658
            )
        )
        hotels.add(
            Hotel(
                "steingberger.jpg", R.drawable.steingberger,
                14, "Steigenberger Hotel Herrenhof", "Austria", 9.0, 2873,
                48.2097958, 16.3658705
            )
        )

        return hotels
    }


    override fun onHotelClick(hotel: Hotel) {
        val intent = Intent(this, ReviewListActivity::class.java)
        intent.putExtra(REVIEW_LIST_HOTEL_NAME_ARG, hotel.name)
        startActivity(intent)
    }
}
