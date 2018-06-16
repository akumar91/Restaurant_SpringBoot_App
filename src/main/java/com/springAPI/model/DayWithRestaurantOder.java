package com.springAPI.model;

import java.util.List;

public class DayWithRestaurantOder {

    String day;

    List<RestaurantOrders> restaurantOrders;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public List<RestaurantOrders> getRestaurantOrders() {
        return restaurantOrders;
    }

    public void setRestaurantOrders(List<RestaurantOrders> restaurantOrders) {
        this.restaurantOrders = restaurantOrders;
    }
}
