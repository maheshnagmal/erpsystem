package com.erp.createcompany.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProductStore {
	@Id
    @GeneratedValue
    int id;
	String productName;
	int productQuantity;
	String itemsName[];
	String itemsQuantity[];
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
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String[] getItemsName() {
		return itemsName;
	}
	public void setItemsName(String[] itemsName) {
		this.itemsName = itemsName;
	}
	public String[] getItemsQuantity() {
		return itemsQuantity;
	}
	public void setItemsQuantity(String[] itemsQuantity) {
		this.itemsQuantity = itemsQuantity;
	}
	@Override
	public String toString() {
		return "ProductStore [id=" + id + ", productName=" + productName + ", productQuantity=" + productQuantity
				+ ", itemsName=" + Arrays.toString(itemsName) + ", itemsQuantity=" + Arrays.toString(itemsQuantity)
				+ "]";
	}
	
}
