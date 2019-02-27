package com.svmapp.model;

public class RegisteredUser extends Entity{

	private int id;
	private String name;
	private String gender;
	private String contact_number;
	private String booklet_language;
	private String booklet_id;
	private String address;
	private String email;
	private String occupation;
	private String gothra;
	private String nakshatra;
	private String upadesha;
	private String additional_info;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getBooklet_language() {
		return booklet_language;
	}
	public void setBooklet_language(String booklet_language) {
		this.booklet_language = booklet_language;
	}
	public String getBooklet_id() {
		return booklet_id;
	}
	public void setBooklet_id(String booklet_id) {
		this.booklet_id = booklet_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getGothra() {
		return gothra;
	}
	public void setGothra(String gothra) {
		this.gothra = gothra;
	}
	public String getNakshatra() {
		return nakshatra;
	}
	public void setNakshatra(String nakshatra) {
		this.nakshatra = nakshatra;
	}
	public String getUpadesha() {
		return upadesha;
	}
	public void setUpadesha(String upadesha) {
		this.upadesha = upadesha;
	}
	public String getAdditional_info() {
		return additional_info;
	}
	public void setAdditional_info(String additional_info) {
		this.additional_info = additional_info;
	}
	
}
