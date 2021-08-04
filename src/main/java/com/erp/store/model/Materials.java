package com.erp.store.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Materials {
	@Id
	@GeneratedValue
	int id;
	String productName;
    String itemName;
    String supplierName;
    int quantity;
   String recurrent;
    String remaining;
    String productionDays;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getRecurrent() {
		return recurrent;
	}
	public void setRecurrent(String recurrent) {
		this.recurrent = recurrent;
	}
	public String getRemaining() {
		return remaining;
	}
	public void setRemaining(String remaining) {
		this.remaining = remaining;
	}
	public String getProductionDays() {
		return productionDays;
	}
	public void setProductionDays(String productionDays) {
		this.productionDays = productionDays;
	}
	@Override
	public String toString() {
		return "Materials [id=" + id + ", productName=" + productName + ", itemName=" + itemName + ", supplierName="
				+ supplierName + ", quantity=" + quantity + ", recurrent=" + recurrent + ", remaining=" + remaining
				+ ", productionDays=" + productionDays + "]";
	}
    
    
}
