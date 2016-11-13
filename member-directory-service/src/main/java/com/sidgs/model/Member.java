package com.sidgs.model;


public class Member {

	private long member_id;
	private String firstName;
	private String lastName;
	private String email;
	private int phone;
	private String address;

	

//	//mapping many-many
//    List<Education> certifications ;
//
//    // 0-many
//    List<Preference> preferences ;
//
//    //1 -many
//    List<Address> addresses ;


	public long getMember_id() {
		return member_id;
	}


	public void setMember_id(long member_id) {
		this.member_id = member_id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}



	
	@Override
	public String toString() {
		return "Member [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	}
}
