package com.springAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DropOff {

    @JsonProperty("dropoffs")
    List<DayWithRestaurantOder> dayWithRestaurantOder;

    public List<DayWithRestaurantOder> getDayWithRestaurantOder() {
        return dayWithRestaurantOder;
    }

    public void setDayWithRestaurantOder(List<DayWithRestaurantOder> dayWithRestaurantOder) {
        this.dayWithRestaurantOder = dayWithRestaurantOder;
    }
}
