package com.springAPI.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.springAPI.model.RestaurantOrders;
import com.springAPI.repository.RestaurantOrderRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
	
	private RestaurantOrderRepository restaurantRepository;
	
	public DevBootstrap(RestaurantOrderRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
		
	}
	
	private void initData() {
		//Monday
		RestaurantOrders rest = new RestaurantOrders();
		rest.setRestaurantName("Nacho's Mexican Grill");
		rest.setLogoUrl("https://www.placehold.it/300X200");
		rest.setCutoff("10:00:00");
		rest.setDropOff("11:15:00");
		rest.setSellingOut(false);
		rest.setIsPastCutoff(false);
		rest.setIsOrderPlaced(false);
		rest.setDeliveryId(47L);
		rest.setDay("Monday");
		restaurantRepository.save(rest);
		
		RestaurantOrders rest2 = new RestaurantOrders();
		rest2.setRestaurantName("Jersey Mike's Subs");
		rest2.setLogoUrl("https://www.placehold.it/300X200");
		rest2.setCutoff("10:30:00");
		rest2.setDropOff("11:15:00");
		rest2.setSellingOut(false);
		rest2.setIsPastCutoff(false);
		rest2.setIsOrderPlaced(false);
		rest2.setDeliveryId(25L);
		rest2.setDay("Monday");
		restaurantRepository.save(rest2);
		
		//Tuesday
		RestaurantOrders rest3 = new RestaurantOrders();
		rest3.setRestaurantName("Firehouse Subs");
		rest3.setLogoUrl("https://www.placehold.it/300X200");
		rest3.setCutoff("10:30:00");
		rest3.setDropOff("11:20:00");
		rest3.setSellingOut(false);
		rest3.setIsPastCutoff(true);
		rest3.setIsOrderPlaced(false);
		rest3.setDeliveryId(68L);
		rest3.setDay("Tuesday");
		restaurantRepository.save(rest3);
		
		
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub
		initData();
	}
}
