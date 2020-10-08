package com.demo.demo_icoderss.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResultItem{

	@SerializedName("menu_description")
	private String menuDescription;

	@SerializedName("restaurant_id")
	private int restaurantId;

	@SerializedName("menu_name")
	private String menuName;

	@SerializedName("item_counts")
	private int itemCounts;

	@SerializedName("menu_item_detail")
	private List<MenuItemDetailItem> menuItemDetail;

	@SerializedName("restaurant_menu_id")
	private int restaurantMenuId;

	@SerializedName("is_display_image")
	private String isDisplayImage;

	@SerializedName("menu_image")
	private String menuImage;

	public void setMenuDescription(String menuDescription){
		this.menuDescription = menuDescription;
	}

	public String getMenuDescription(){
		return menuDescription;
	}

	public void setRestaurantId(int restaurantId){
		this.restaurantId = restaurantId;
	}

	public int getRestaurantId(){
		return restaurantId;
	}

	public void setMenuName(String menuName){
		this.menuName = menuName;
	}

	public String getMenuName(){
		return menuName;
	}

	public void setItemCounts(int itemCounts){
		this.itemCounts = itemCounts;
	}

	public int getItemCounts(){
		return itemCounts;
	}

	public void setMenuItemDetail(List<MenuItemDetailItem> menuItemDetail){
		this.menuItemDetail = menuItemDetail;
	}

	public List<MenuItemDetailItem> getMenuItemDetail(){
		return menuItemDetail;
	}

	public void setRestaurantMenuId(int restaurantMenuId){
		this.restaurantMenuId = restaurantMenuId;
	}

	public int getRestaurantMenuId(){
		return restaurantMenuId;
	}

	public void setIsDisplayImage(String isDisplayImage){
		this.isDisplayImage = isDisplayImage;
	}

	public String getIsDisplayImage(){
		return isDisplayImage;
	}

	public void setMenuImage(String menuImage){
		this.menuImage = menuImage;
	}

	public String getMenuImage(){
		return menuImage;
	}
}