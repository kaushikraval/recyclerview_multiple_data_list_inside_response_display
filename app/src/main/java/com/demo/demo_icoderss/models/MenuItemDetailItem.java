package com.demo.demo_icoderss.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MenuItemDetailItem{

	@SerializedName("image")
	private String image;

	@SerializedName("quantity")
	private int quantity;

	@SerializedName("item_id")
	private String itemId;

	@SerializedName("restaurant_id")
	private int restaurantId;

	@SerializedName("item_type")
	private String itemType;

	@SerializedName("item_name")
	private String itemName;

	@SerializedName("mrp")
	private String mrp;

	@SerializedName("custom_details")
	private List<Object> customDetails;

	@SerializedName("is_alcoholic")
	private String isAlcoholic;

	@SerializedName("price")
	private String price;

	@SerializedName("is_customization")
	private int isCustomization;

	@SerializedName("item_images")
	private List<ItemImagesItem> itemImages;

	@SerializedName("item_description")
	private String itemDescription;

	@SerializedName("is_sold_out")
	private String isSoldOut;

	@SerializedName("time_slot")
	private String timeSlot;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setItemId(String itemId){
		this.itemId = itemId;
	}

	public String getItemId(){
		return itemId;
	}

	public void setRestaurantId(int restaurantId){
		this.restaurantId = restaurantId;
	}

	public int getRestaurantId(){
		return restaurantId;
	}

	public void setItemType(String itemType){
		this.itemType = itemType;
	}

	public String getItemType(){
		return itemType;
	}

	public void setItemName(String itemName){
		this.itemName = itemName;
	}

	public String getItemName(){
		return itemName;
	}

	public void setMrp(String mrp){
		this.mrp = mrp;
	}

	public String getMrp(){
		return mrp;
	}

	public void setCustomDetails(List<Object> customDetails){
		this.customDetails = customDetails;
	}

	public List<Object> getCustomDetails(){
		return customDetails;
	}

	public void setIsAlcoholic(String isAlcoholic){
		this.isAlcoholic = isAlcoholic;
	}

	public String getIsAlcoholic(){
		return isAlcoholic;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setIsCustomization(int isCustomization){
		this.isCustomization = isCustomization;
	}

	public int getIsCustomization(){
		return isCustomization;
	}

	public void setItemImages(List<ItemImagesItem> itemImages){
		this.itemImages = itemImages;
	}

	public List<ItemImagesItem> getItemImages(){
		return itemImages;
	}

	public void setItemDescription(String itemDescription){
		this.itemDescription = itemDescription;
	}

	public String getItemDescription(){
		return itemDescription;
	}

	public void setIsSoldOut(String isSoldOut){
		this.isSoldOut = isSoldOut;
	}

	public String getIsSoldOut(){
		return isSoldOut;
	}

	public void setTimeSlot(String timeSlot){
		this.timeSlot = timeSlot;
	}

	public String getTimeSlot(){
		return timeSlot;
	}
}