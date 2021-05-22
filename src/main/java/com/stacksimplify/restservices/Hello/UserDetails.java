package com.stacksimplify.restservices.Hello;

public class UserDetails {
	
	
	private String firstname;
	private String lastname;
	private String city;
	//Field constructors
	
	public String getFirstname() {
		return firstname;
	}
	public UserDetails(String firstname, String lastname, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
	}
	
	//Getters and Setters
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//To string
	@Override
	public String toString() {
		return "UserDetails [firstname=" + firstname + ", lastname=" + lastname + ", city=" + city + "]";
	}

}
