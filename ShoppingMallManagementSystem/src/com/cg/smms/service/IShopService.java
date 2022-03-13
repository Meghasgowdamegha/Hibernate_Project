package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Shop;

public interface IShopService {
	
public Shop addShop(Shop shop);
public Shop updateShop(Shop shop);
public Shop searchShopById(int id);
public boolean deleteShop(int id);
public boolean addEmployee(Employee employee);
public boolean updateEmployee(Employee employee);

}