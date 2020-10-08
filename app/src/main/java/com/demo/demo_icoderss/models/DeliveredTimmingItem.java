package com.demo.demo_icoderss.models;

import com.google.gson.annotations.SerializedName;

public class DeliveredTimmingItem{

	@SerializedName("restaurant_id")
	private int restaurantId;

	@SerializedName("open_time")
	private String openTime;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("hours_id")
	private int hoursId;

	@SerializedName("close_time")
	private String closeTime;

	@SerializedName("day")
	private String day;

	@SerializedName("status")
	private String status;

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

	public void setHoursId(int hoursId){
		this.hoursId = hoursId;
	}

	public int getHoursId(){
		return hoursId;
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