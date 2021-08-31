package com.erp.createcompany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class BusinessProfile {
	@Id
	@GeneratedValue
	private int busniessID;
	private String businessName;
	private String phoneNo;
	private String emailID;
	private String businessAddress;
	private String businessDescription;
	private String gstn;
	private String businessType;
	private String businessCategory;
	private String logo;
	private String state;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getBusinessAddress() {
		return businessAddress;
	}
	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}
	public String getBusinessDescription() {
		return businessDescription;
	}
	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}
	public String getGstn() {
		return gstn;
	}
	public void setGstn(String gstn) {
		this.gstn = gstn;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "BusinessProfile [busniessID=" + busniessID + ", businessName=" + businessName + ", phoneNo=" + phoneNo
				+ ", emailID=" + emailID + ", businessAddress=" + businessAddress + ", businessDescription="
				+ businessDescription + ", gstn=" + gstn + ", businessType=" + businessType + ", businessCategory="
				+ businessCategory + ", logo=" + logo + ", state=" + state + "]";
	}
	
}
