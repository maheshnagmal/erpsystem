package com.erp.store.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Supplier {
	@Id
	@GeneratedValue
	int id;
	String supplierName;
	String firstName;
	String lastName;
	String emailId;
	String billingAddress;
	String dispatchAddress;
	Long phoneNumber;
	String gstnNumber;
	String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getDispatchAddress() {
		return dispatchAddress;
	}
	public void setDispatchAddress(String dispatchAddress) {
		this.dispatchAddress = dispatchAddress;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGstnNumber() {
		return gstnNumber;
	}
	public void setGstnNumber(String gstnNumber) {
		this.gstnNumber = gstnNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", supplierName=" + supplierName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", emailId=" + emailId + ", billingAddress=" + billingAddress + ", dispatchAddress="
				+ dispatchAddress + ", phoneNumber=" + phoneNumber + ", gstnNumber=" + gstnNumber + ", country="
				+ country + "]";
	}
	
}
