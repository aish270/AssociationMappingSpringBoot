package com.example.demo.model;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity

@Table(name="employeedetails")

public class employee {
	@Id

	private int id;
	
	private String name;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="doorno1")
	private address add;
	public int getId() {
		return id;
	}
	public employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public address getAddress() {
		return add;
	}
	public void setAddress(address add) {
		this.add=add;
	}
	public employee(int id, String name, address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public employee() {
		
	}
	
	

}
