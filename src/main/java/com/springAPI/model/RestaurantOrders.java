package com.springAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Table;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class RestaurantOrders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long storeId;
	private Long deliveryId;

	@JsonIgnore
	private String day;
	private String restaurantName;
	private String logoUrl;
	private String cutoff;
	private String dropOff;
	private Boolean sellingOut;
	private Boolean isPastCutoff;
	private Boolean isOrderPlaced;

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Boolean getPastCutoff() {
		return isPastCutoff;
	}

	public void setPastCutoff(Boolean pastCutoff) {
		isPastCutoff = pastCutoff;
	}

	public Boolean getOrderPlaced() {
		return isOrderPlaced;
	}

	public void setOrderPlaced(Boolean orderPlaced) {
		isOrderPlaced = orderPlaced;
	}
	public Long getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Boolean getIsOrderPlaced() {
		return isOrderPlaced;
	}
	public void setIsOrderPlaced(Boolean isOrderPlaced) {
		this.isOrderPlaced = isOrderPlaced;
	}
	public String getCutoff() {
		return cutoff;
	}
	public void setCutoff(String cutoff) {
		this.cutoff = cutoff;
	}
	public String getDropOff() {
		return dropOff;
	}
	public void setDropOff(String dropOff) {
		this.dropOff = dropOff;
	}
	public Boolean getSellingOut() {
		return sellingOut;
	}
	public void setSellingOut(Boolean sellingOut) {
		this.sellingOut = sellingOut;
	}
	public Boolean getIsPastCutoff() {
		return isPastCutoff;
	}
	public void setIsPastCutoff(Boolean isPastCutoff) {
		this.isPastCutoff = isPastCutoff;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	
	
}
