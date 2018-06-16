package com.springAPI.service;

import com.springAPI.model.DayWithRestaurantOder;
import com.springAPI.model.DropOff;
import com.springAPI.model.RestaurantOrders;
import com.springAPI.repository.RestaurantOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantDeliveryServiceImpl implements RestaurantDeliveryService {

    @Autowired
    private RestaurantOrderRepository restaurantOrderRepository;

    @Override
    public DropOff findDeliveries()
    {

        DropOff dropOff = new DropOff();

        List<DayWithRestaurantOder> dayWithRestaurantOders = new ArrayList<>();

        for(Day day : Day.values()) {
            List<RestaurantOrders> allOrders =  restaurantOrderRepository.findByDay(day.toString());

            DayWithRestaurantOder dayWithRestaurantOder = new DayWithRestaurantOder();
            dayWithRestaurantOder.setDay(day.toString());
            dayWithRestaurantOder.setRestaurantOrders(allOrders);

            dayWithRestaurantOders.add(dayWithRestaurantOder);
        }

        dropOff.setDayWithRestaurantOder(dayWithRestaurantOders);
        
        return dropOff;

    }

    // An Enum for days
    private enum Day
    {
        Sunday, Monday, Tuesday, Wednesday,
        Thursday, Friday, Saturday;
    }
}
