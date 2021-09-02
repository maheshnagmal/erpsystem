package com.erp.createcompany.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Units {
	@Id
	private int Id;
	private String name;
	private String sname;
	
	@OneToMany(mappedBy = "unit")
	private List<ConversionRate> rate;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<ConversionRate> getRate() {
		return rate;
	}
	public void setRate(List<ConversionRate> rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Units [Id=" + Id + ", name=" + name + ", sname=" + sname + ", rate=" + rate + "]";
	}
	
}
