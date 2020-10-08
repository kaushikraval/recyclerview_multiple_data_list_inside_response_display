package com.demo.demo_icoderss.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class RestaurantDetails{

	@SerializedName("admin_beverages_enable")
	private int adminBeveragesEnable;

	@SerializedName("cuisine_name")
	private List<Object> cuisineName;

	@SerializedName("country")
	private Object country;

	@SerializedName("Address")
	private Object address;

	@SerializedName("delivered_timming")
	private List<DeliveredTimmingItem> deliveredTimming;

	@SerializedName("rating")
	private int rating;

	@SerializedName("promo_code")
	private String promoCode;

	@SerializedName("delivery_time")
	private String deliveryTime;

	@SerializedName("full_address")
	private String fullAddress;

	@SerializedName("commision")
	private Object commision;

	@SerializedName("parcel_charge")
	private int parcelCharge;

	@SerializedName("delivery_times")
	private String deliveryTimes;

	@SerializedName("password")
	private String password;

	@SerializedName("SGST")
	private String sGST;

	@SerializedName("restaurants_price_type")
	private String restaurantsPriceType;

	@SerializedName("restaurant_on_off")
	private String restaurantOnOff;

	@SerializedName("restaurant_type")
	private String restaurantType;

	@SerializedName("state")
	private Object state;

	@SerializedName("rating_user_count")
	private int ratingUserCount;

	@SerializedName("unique_code")
	private String uniqueCode;

	@SerializedName("longitude")
	private String longitude;

	@SerializedName("area")
	private Object area;

	@SerializedName("location_address")
	private String locationAddress;

	@SerializedName("pincode")
	private String pincode;

	@SerializedName("two_person_price")
	private String twoPersonPrice;

	@SerializedName("fssai_licence")
	private String fssaiLicence;

	@SerializedName("registration_phone")
	private String registrationPhone;

	@SerializedName("icon_image")
	private String iconImage;

	@SerializedName("last_login_date")
	private Object lastLoginDate;

	@SerializedName("delivery_charge_old")
	private int deliveryChargeOld;

	@SerializedName("admin_commision")
	private int adminCommision;

	@SerializedName("delivery_charge")
	private String deliveryCharge;

	@SerializedName("user_id")
	private int userId;

	@SerializedName("phone")
	private String phone;

	@SerializedName("is_confirm")
	private int isConfirm;

	@SerializedName("vendor_id")
	private int vendorId;

	@SerializedName("name")
	private String name;

	@SerializedName("admin_commision_type")
	private String adminCommisionType;

	@SerializedName("status")
	private int status;

	@SerializedName("is_promoted")
	private String isPromoted;

	@SerializedName("city")
	private Object city;

	@SerializedName("restaurant_id")
	private int restaurantId;

	@SerializedName("address_thai")
	private String addressThai;

	@SerializedName("latitude")
	private String latitude;

	@SerializedName("registration_device")
	private Object registrationDevice;

	@SerializedName("description")
	private String description;

	@SerializedName("business_licence_number")
	private String businessLicenceNumber;

	@SerializedName("category_id")
	private int categoryId;

	@SerializedName("avg_rating")
	private String avgRating;

	@SerializedName("item_counts")
	private int itemCounts;

	@SerializedName("CGST")
	private String cGST;

	@SerializedName("name_thai")
	private String nameThai;

	@SerializedName("delivery_type_time_slots")
	private String deliveryTypeTimeSlots;

	@SerializedName("email")
	private String email;


	@SerializedName("deliver_within_apartment")
	private int deliverWithinApartment;

	@SerializedName("payment_option")
	private String paymentOption;

	@SerializedName("service_fee")
	private String serviceFee;

	@SerializedName("is_own_driver")
	private String isOwnDriver;

	@SerializedName("restaurant_tax")
	private int restaurantTax;

	@SerializedName("max_dilivery_radius")
	private int maxDiliveryRadius;

	@SerializedName("new_delivered_timming")
	private List<NewDeliveredTimmingItem> newDeliveredTimming;

	@SerializedName("is_same_day_delivery")
	private int isSameDayDelivery;

	@SerializedName("time_slots")
	private String timeSlots;

	@SerializedName("is_library")
	private int isLibrary;

	@SerializedName("pickup_timming")
	private List<PickupTimmingItem> pickupTimming;

	@SerializedName("created_date")
	private String createdDate;

	@SerializedName("updated_date")
	private String updatedDate;

	@SerializedName("apartment")
	private int apartment;

	@SerializedName("minimum_order_value")
	private String minimumOrderValue;

	public void setAdminBeveragesEnable(int adminBeveragesEnable){
		this.adminBeveragesEnable = adminBeveragesEnable;
	}

	public int getAdminBeveragesEnable(){
		return adminBeveragesEnable;
	}

	public void setCuisineName(List<Object> cuisineName){
		this.cuisineName = cuisineName;
	}

	public List<Object> getCuisineName(){
		return cuisineName;
	}

	public void setCountry(Object country){
		this.country = country;
	}

	public Object getCountry(){
		return country;
	}

	public void setAddress(Object address){
		this.address = address;
	}


	public void setDeliveredTimming(List<DeliveredTimmingItem> deliveredTimming){
		this.deliveredTimming = deliveredTimming;
	}

	public List<DeliveredTimmingItem> getDeliveredTimming(){
		return deliveredTimming;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setPromoCode(String promoCode){
		this.promoCode = promoCode;
	}

	public String getPromoCode(){
		return promoCode;
	}

	public void setDeliveryTime(String deliveryTime){
		this.deliveryTime = deliveryTime;
	}

	public String getDeliveryTime(){
		return deliveryTime;
	}

	public void setFullAddress(String fullAddress){
		this.fullAddress = fullAddress;
	}

	public String getFullAddress(){
		return fullAddress;
	}

	public void setCommision(Object commision){
		this.commision = commision;
	}

	public Object getCommision(){
		return commision;
	}

	public void setParcelCharge(int parcelCharge){
		this.parcelCharge = parcelCharge;
	}

	public int getParcelCharge(){
		return parcelCharge;
	}

	public void setDeliveryTimes(String deliveryTimes){
		this.deliveryTimes = deliveryTimes;
	}

	public String getDeliveryTimes(){
		return deliveryTimes;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setSGST(String sGST){
		this.sGST = sGST;
	}

	public String getSGST(){
		return sGST;
	}

	public void setRestaurantsPriceType(String restaurantsPriceType){
		this.restaurantsPriceType = restaurantsPriceType;
	}

	public String getRestaurantsPriceType(){
		return restaurantsPriceType;
	}

	public void setRestaurantOnOff(String restaurantOnOff){
		this.restaurantOnOff = restaurantOnOff;
	}

	public String getRestaurantOnOff(){
		return restaurantOnOff;
	}

	public void setRestaurantType(String restaurantType){
		this.restaurantType = restaurantType;
	}

	public String getRestaurantType(){
		return restaurantType;
	}

	public void setState(Object state){
		this.state = state;
	}

	public Object getState(){
		return state;
	}

	public void setRatingUserCount(int ratingUserCount){
		this.ratingUserCount = ratingUserCount;
	}

	public int getRatingUserCount(){
		return ratingUserCount;
	}

	public void setUniqueCode(String uniqueCode){
		this.uniqueCode = uniqueCode;
	}

	public String getUniqueCode(){
		return uniqueCode;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	public void setArea(Object area){
		this.area = area;
	}

	public Object getArea(){
		return area;
	}

	public void setLocationAddress(String locationAddress){
		this.locationAddress = locationAddress;
	}

	public String getLocationAddress(){
		return locationAddress;
	}

	public void setPincode(String pincode){
		this.pincode = pincode;
	}

	public String getPincode(){
		return pincode;
	}

	public void setTwoPersonPrice(String twoPersonPrice){
		this.twoPersonPrice = twoPersonPrice;
	}

	public String getTwoPersonPrice(){
		return twoPersonPrice;
	}

	public void setFssaiLicence(String fssaiLicence){
		this.fssaiLicence = fssaiLicence;
	}

	public String getFssaiLicence(){
		return fssaiLicence;
	}

	public void setRegistrationPhone(String registrationPhone){
		this.registrationPhone = registrationPhone;
	}

	public String getRegistrationPhone(){
		return registrationPhone;
	}

	public void setIconImage(String iconImage){
		this.iconImage = iconImage;
	}

	public String getIconImage(){
		return iconImage;
	}

	public void setLastLoginDate(Object lastLoginDate){
		this.lastLoginDate = lastLoginDate;
	}

	public Object getLastLoginDate(){
		return lastLoginDate;
	}

	public void setDeliveryChargeOld(int deliveryChargeOld){
		this.deliveryChargeOld = deliveryChargeOld;
	}

	public int getDeliveryChargeOld(){
		return deliveryChargeOld;
	}

	public void setAdminCommision(int adminCommision){
		this.adminCommision = adminCommision;
	}

	public int getAdminCommision(){
		return adminCommision;
	}

	public void setDeliveryCharge(String deliveryCharge){
		this.deliveryCharge = deliveryCharge;
	}

	public String getDeliveryCharge(){
		return deliveryCharge;
	}

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setIsConfirm(int isConfirm){
		this.isConfirm = isConfirm;
	}

	public int getIsConfirm(){
		return isConfirm;
	}

	public void setVendorId(int vendorId){
		this.vendorId = vendorId;
	}

	public int getVendorId(){
		return vendorId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAdminCommisionType(String adminCommisionType){
		this.adminCommisionType = adminCommisionType;
	}

	public String getAdminCommisionType(){
		return adminCommisionType;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	public void setIsPromoted(String isPromoted){
		this.isPromoted = isPromoted;
	}

	public String getIsPromoted(){
		return isPromoted;
	}

	public void setCity(Object city){
		this.city = city;
	}

	public Object getCity(){
		return city;
	}

	public void setRestaurantId(int restaurantId){
		this.restaurantId = restaurantId;
	}

	public int getRestaurantId(){
		return restaurantId;
	}

	public void setAddressThai(String addressThai){
		this.addressThai = addressThai;
	}

	public String getAddressThai(){
		return addressThai;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setRegistrationDevice(Object registrationDevice){
		this.registrationDevice = registrationDevice;
	}

	public Object getRegistrationDevice(){
		return registrationDevice;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setBusinessLicenceNumber(String businessLicenceNumber){
		this.businessLicenceNumber = businessLicenceNumber;
	}

	public String getBusinessLicenceNumber(){
		return businessLicenceNumber;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public void setAvgRating(String avgRating){
		this.avgRating = avgRating;
	}

	public String getAvgRating(){
		return avgRating;
	}

	public void setItemCounts(int itemCounts){
		this.itemCounts = itemCounts;
	}

	public int getItemCounts(){
		return itemCounts;
	}

	public void setCGST(String cGST){
		this.cGST = cGST;
	}

	public String getCGST(){
		return cGST;
	}

	public void setNameThai(String nameThai){
		this.nameThai = nameThai;
	}

	public String getNameThai(){
		return nameThai;
	}

	public void setDeliveryTypeTimeSlots(String deliveryTypeTimeSlots){
		this.deliveryTypeTimeSlots = deliveryTypeTimeSlots;
	}

	public String getDeliveryTypeTimeSlots(){
		return deliveryTypeTimeSlots;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setAddress(String address){
		this.address = address;
	}


	public void setDeliverWithinApartment(int deliverWithinApartment){
		this.deliverWithinApartment = deliverWithinApartment;
	}

	public int getDeliverWithinApartment(){
		return deliverWithinApartment;
	}

	public void setPaymentOption(String paymentOption){
		this.paymentOption = paymentOption;
	}

	public String getPaymentOption(){
		return paymentOption;
	}

	public void setServiceFee(String serviceFee){
		this.serviceFee = serviceFee;
	}

	public String getServiceFee(){
		return serviceFee;
	}

	public void setIsOwnDriver(String isOwnDriver){
		this.isOwnDriver = isOwnDriver;
	}

	public String getIsOwnDriver(){
		return isOwnDriver;
	}

	public void setRestaurantTax(int restaurantTax){
		this.restaurantTax = restaurantTax;
	}

	public int getRestaurantTax(){
		return restaurantTax;
	}

	public void setMaxDiliveryRadius(int maxDiliveryRadius){
		this.maxDiliveryRadius = maxDiliveryRadius;
	}

	public int getMaxDiliveryRadius(){
		return maxDiliveryRadius;
	}

	public void setNewDeliveredTimming(List<NewDeliveredTimmingItem> newDeliveredTimming){
		this.newDeliveredTimming = newDeliveredTimming;
	}

	public List<NewDeliveredTimmingItem> getNewDeliveredTimming(){
		return newDeliveredTimming;
	}

	public void setIsSameDayDelivery(int isSameDayDelivery){
		this.isSameDayDelivery = isSameDayDelivery;
	}

	public int getIsSameDayDelivery(){
		return isSameDayDelivery;
	}

	public void setTimeSlots(String timeSlots){
		this.timeSlots = timeSlots;
	}

	public String getTimeSlots(){
		return timeSlots;
	}

	public void setIsLibrary(int isLibrary){
		this.isLibrary = isLibrary;
	}

	public int getIsLibrary(){
		return isLibrary;
	}

	public void setPickupTimming(List<PickupTimmingItem> pickupTimming){
		this.pickupTimming = pickupTimming;
	}

	public List<PickupTimmingItem> getPickupTimming(){
		return pickupTimming;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setApartment(int apartment){
		this.apartment = apartment;
	}

	public int getApartment(){
		return apartment;
	}

	public void setMinimumOrderValue(String minimumOrderValue){
		this.minimumOrderValue = minimumOrderValue;
	}

	public String getMinimumOrderValue(){
		return minimumOrderValue;
	}
}