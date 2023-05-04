package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create hotel
   Hotel createHotel(Hotel hotel);

   //Get hotel
    Hotel getHotel(String id);

    List<Hotel> getAllHotel();
}
