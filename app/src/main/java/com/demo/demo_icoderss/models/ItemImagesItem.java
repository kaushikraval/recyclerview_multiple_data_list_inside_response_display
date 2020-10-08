package com.demo.demo_icoderss.models;

import com.google.gson.annotations.SerializedName;

public class ItemImagesItem{

	@SerializedName("image_name")
	private String imageName;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("restaurant_id")
	private int restaurantId;

	@SerializedName("vendor_id")
	private int vendorId;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("restaurant_menu_item_id")
	private int restaurantMenuItemId;

	public void setImageName(String imageName){
		this.imageName = imageName;
	}

	public String getImageName(){
		return imageName;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setRestaurantId(int restaurantId){
		this.restaurantId = restaurantId;
	}

	public int getRestaurantId(){
		return restaurantId;
	}

	public void setVendorId(int vendorId){
		this.vendorId = vendorId;
	}

	public int getVendorId(){
		return vendorId;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setRestaurantMenuItemId(int restaurantMenuItemId){
		this.restaurantMenuItemId = restaurantMenuItemId;
	}

	public int getRestaurantMenuItemId(){
		return restaurantMenuItemId;
	}
}