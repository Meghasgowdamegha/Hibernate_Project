package com.cg.smms.entities;

import java.io.Serializable;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shop")
@Inheritance(strategy=InheritanceType.JOINED)
public class Shop implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	@OneToMany(mappedBy ="shop",cascade=CascadeType.ALL)
	private Set<Employee> employees = new HashSet<>();

	@Column(name="shop_id")
	private int Shop_id;
	
	@Column(name="shopCategory")
	private String shopCategory; 
	
	@Column(name="shopEmployeeId")
	private String shopEmployeeId;
	
	@Column(name="shopName")
	private String shopName;
	
	@Column(name="Customer")
	private String Customer;
	
	@Column(name="shopStatus")
	private String shopStatus;
	
	@Column(name="shopOwner")
	private String shopOwner;
	
	@Column(name="leaseStatus")
	private String leaseStatus;
	
	public Shop(Set<Employee> employees, int shop_id, String shopCategory, String shopEmployeeId, String shopName,
			String customer, String shopStatus, String shopOwner, String leaseStatus) {
		super();
		this.employees = employees;
		Shop_id = shop_id;
		this.shopCategory = shopCategory;
		this.shopEmployeeId = shopEmployeeId;
		this.shopName = shopName;
		Customer = customer;
		this.shopStatus = shopStatus;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
	
}

	public Shop() {
		
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public int getShop_id() {
		return Shop_id;
	}

	public void setShop_id(int shop_id) {
		Shop_id = shop_id;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopEmployeeId() {
		return shopEmployeeId;
	}

	public void setShopEmployeeId(String shopEmployeeId) {
		this.shopEmployeeId = shopEmployeeId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCustomer() {
		return Customer;
	}

	public void setCustomer(String customer) {
		Customer = customer;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeastStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

	
	