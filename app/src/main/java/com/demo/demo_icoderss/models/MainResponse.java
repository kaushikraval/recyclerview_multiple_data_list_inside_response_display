package com.demo.demo_icoderss.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MainResponse{

	@SerializedName("msg")
	private String msg;

	@SerializedName("Bravges")
	private Bravges bravges;

	@SerializedName("code")
	private int code;

	@SerializedName("restaurant_on_off")
	private String restaurantOnOff;

	@SerializedName("restaurant_details")
	private RestaurantDetails restaurantDetails;

	@SerializedName("Result")
	private List<ResultItem> result;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setBravges(Bravges bravges){
		this.bravges = bravges;
	}

	public Bravges getBravges(){
		return bravges;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setRestaurantOnOff(String restaurantOnOff){
		this.restaurantOnOff = restaurantOnOff;
	}

	public String getRestaurantOnOff(){
		return restaurantOnOff;
	}

	public void setRestaurantDetails(RestaurantDetails restaurantDetails){
		this.restaurantDetails = restaurantDetails;
	}

	public RestaurantDetails getRestaurantDetails(){
		return restaurantDetails;
	}

	public void setResult(List<ResultItem> result){
		this.result = result;
	}

	public List<ResultItem> getResult(){
		return result;
	}
}