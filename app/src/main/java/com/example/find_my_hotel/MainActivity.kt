package com.example.find_my_hotel

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.find_my_hotel.constants.HOTEL_LIST_COUNTRY_ARG
import com.example.find_my_hotel.hotel.HotelListActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var netherlandsButton: Button
    lateinit var ukButton: Button
    lateinit var franceButton: Button
    lateinit var italyButton: Button
    lateinit var austriaButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.country_search)

        netherlandsButton = findViewById(R.id.netherlands_button)
        ukButton = findViewById(R.id.uk_button)
        franceButton = findViewById(R.id.france_button)
        italyButton = findViewById(R.id.italy_button)
        austriaButton = findViewById(R.id.austria_button)

        netherlandsButton.setOnClickListener(this)
        ukButton.setOnClickListener(this)
        franceButton.setOnClickListener(this)
        italyButton.setOnClickListener(this)
        austriaButton.setOnClickListener(this)

    }

    override fun onClick(clickedView: View?) {
        when (clickedView) {
            netherlandsButton -> {
                openHotelListActivity("Netherlands")
            }
            ukButton -> {
                openHotelListActivity("United Kingdom")
            }
            franceButton -> {
                openHotelListActivity("France")
            }
            italyButton -> {
                openHotelListActivity("Italy")
            }
            austriaButton -> {
                openHotelListActivity("Austria")
            }
            }

        }

    private fun openHotelListActivity(hotelCountry: String) {
        val intent = Intent(this, HotelListActivity::class.java)
        intent.putExtra(HOTEL_LIST_COUNTRY_ARG, hotelCountry)
        startActivity(intent)
    }

}


