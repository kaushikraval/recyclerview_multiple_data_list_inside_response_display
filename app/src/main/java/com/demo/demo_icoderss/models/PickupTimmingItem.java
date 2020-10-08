package com.demo.demo_icoderss.models;

import com.google.gson.annotations.SerializedName;

public class PickupTimmingItem{

	@SerializedName("pickup_hours_id")
	private int pickupHoursId;

	@SerializedName("restaurant_id")
	private int restaurantId;

	@SerializedName("open_time")
	private String openTime;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("close_time")
	private String closeTime;

	@SerializedName("day")
	private String day;

	@SerializedName("status")
	private String status;

	public void setPickupHoursId(int pickupHoursId){
		this.pickupHoursId = pickupHoursId;
	}

	public int getPickupHoursId(){
		return pickupHoursId;
	}

	public void setRestaurantId(int restaurantId){
		this.restaurantId = restaurantId;
	}

	public int getRestaurantId(){
		return restaurantId;
	}

	public void setOpenTime(String openTime){
		this.openTime = openTime;
	}

	public String getOpenTime(){
		return openTime;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setCloseTime(String closeTime){
		this.closeTime = closeTime;
	}

	public String getCloseTime(){
		return closeTime;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}