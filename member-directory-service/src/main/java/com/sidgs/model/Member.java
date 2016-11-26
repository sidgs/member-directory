package com.sidgs.model;

import java.util.List;

//@Entity (name = "member")
public class Member {

//	@Column(name= "member_id")
	long member_id;

//    @Column (name = "member_first_name")
	private String firstName;

//    @Column (name = "member_last_name")
	private String lastName;

	private String email;
	private int phone;
	private String address;

	public long getMember_id() {
		return member_id;
	}

	public void setMember_id(long member_id) {
		this.member_id = member_id;
	}

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
		return "Member [member_id=" + member_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + ", certifications=" + certifications + ", preferences="
				+ preferences + ", addresses=" + addresses + "]";
	}
}

