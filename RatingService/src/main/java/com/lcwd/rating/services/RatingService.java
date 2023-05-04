package com.lcwd.rating.services;

import com.lcwd.rating.enitities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all ratings
    List<Rating> getRatings();

    //get all by Useric
    List<Rating> getRatingByUserId(String userId );

    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId );

}
