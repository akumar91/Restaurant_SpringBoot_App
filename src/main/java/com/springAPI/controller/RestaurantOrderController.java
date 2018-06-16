package com.springAPI.controller;

import com.springAPI.model.DropOff;
import com.springAPI.service.RestaurantDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestaurantOrderController {
	
	@Autowired
	private RestaurantDeliveryService restaurantDeliveryServiceImpl;

	@RequestMapping(value = "/deliveries", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<DropOff> getOrders()  {
		DropOff dropOff = restaurantDeliveryServiceImpl.findDeliveries();
		return new ResponseEntity<>(dropOff, new HttpHeaders(), HttpStatus.OK);
	}
	
}
