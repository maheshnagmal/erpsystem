package com.erp.createcompany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ConversionRate {
	@Id
	
	private int id;
	private String baseUnit;
	private String scondaryUnit;
	@ManyToOne
	private Units unit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBaseUnit() {
		return baseUnit;
	}
	public void setBaseUnit(String baseUnit) {
		this.baseUnit = baseUnit;
	}
	public String getScondaryUnit() {
		return scondaryUnit;
	}
	public void setScondaryUnit(String scondaryUnit) {
		this.scondaryUnit = scondaryUnit;
	}
	@Override
	public String toString() {
		return "ConversionRate [id=" + id + ", baseUnit=" + baseUnit + ", scondaryUnit=" + scondaryUnit + "]";
	}
	
}
