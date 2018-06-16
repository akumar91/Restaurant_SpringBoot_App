package com.springAPI.repository;

import org.springframework.data.repository.CrudRepository;

import com.springAPI.model.RestaurantOrders;

import java.util.List;

public interface RestaurantOrderRepository extends CrudRepository<RestaurantOrders, Long>{

    List<RestaurantOrders> findByDay(String day);

}
