package com.sidgs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity (name = "member")
public class Member {

    @Column (name = "first_name")
	private String firstName;

    @Column (name = "last_name")
	private String lastName;

	private String email;
	private int phone;
	private String address;

    //mapping many-many
    List<Education> certifications ;

    // 0-many
    List<Preference> preferences ;

    //1 -many
    List<Address> addresses ;


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
