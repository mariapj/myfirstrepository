package com.dev.tourguide.beans;

public class LocationDetails {

	private int id;
	private String locationName;
	private String city;
	private String latitude;
	private String longitude;
	private String address;
	
	
	public LocationDetails(int id, String locationName, String city, String latitude, String longitude,
			String address) {
		super();
		this.id = id;
		this.locationName = locationName;
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
	}
	
	public LocationDetails() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
