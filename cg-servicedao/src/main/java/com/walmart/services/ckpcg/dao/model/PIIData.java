package com.walmart.services.ckpcg.dao.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import me.prettyprint.hom.annotations.Column;
import me.prettyprint.hom.annotations.Id;

@Entity
@Table(name="PIIData")
public class PIIData {
	@Id
	@Column(name="cuid")
	private String cuid;
	
    @Column(name="firstName")
	private String firstName;
    
    @Column(name="lastName")
	private String lastName;
	
    @Column(name="dob")
	private String dob;
    
    @Column(name="phoneNumber")
	private String phoneNumber;
    
    @Column(name="email")
	private String email;
    
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCuid() {
		return cuid;
	}
	public void setCuid(String cuid) {
		this.cuid = cuid;
	}
}
