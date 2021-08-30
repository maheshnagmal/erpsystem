package com.erp.createcompany.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Units {
	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private String sname;
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
	@Override
	public String toString() {
		return "Units [Id=" + Id + ", name=" + name + ", sname=" + sname + "]";
	}
	

}
