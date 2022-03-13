package com.cg.smms.entities;

import java.io.Serializable;


import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 @Entity
 @Table(name="employee")
 
public class Employee implements Serializable 
 {
	 
	 /**
	  * 
	  */
	 private static final long serialVersionUID = 1L;
	 
	 public Employee() {
			
		}
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)

	 @Column(name="id")
     private int id;
	 
	 @Column(name="name")
     private String name;
	 
	 @Column(name="dob")
     private int dob;
	 
	 @Column(name="salary")
     private float salary;
	 
	 @Column(name="address")
     private String address;
	 
	 @Column(name="designation")
     private String designation;
	 
	 @ManyToOne
	 @JoinColumn(name="shopid")
	 private Shop shop;
		


	public Employee(int id, String name, int dob, float salary, String address, String designation, Shop shop) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.address = address;
		this.designation = designation;
		this.shop = shop;
	}

	public int getId() {
		return id;
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

	public int getDob() {
		return dob;
	}

	public void setDob(int Dob) {
		this.dob = Dob;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	 
	
}