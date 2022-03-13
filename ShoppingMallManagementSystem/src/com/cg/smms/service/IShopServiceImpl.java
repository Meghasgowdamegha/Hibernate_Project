package com.cg.smms.service;

import com.cg.smms.entities.Employee;

import com.cg.smms.entities.Shop;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.IShopRepositoryImpl;

public class IShopServiceImpl implements IShopService {

	private IShopRepository repository;
	
	public IShopServiceImpl() {
		repository=new IShopRepositoryImpl();
	}

	@Override
	public Shop addShop(Shop shop) {
		repository.beginTransaction();
		repository.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		repository.beginTransaction();
		repository.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		repository.beginTransaction();
		repository.commitTransaction();
		return null;	
	}

	@Override
	public boolean deleteShop(int id) {
		repository.beginTransaction();
		repository.commitTransaction();
		return false;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		repository.beginTransaction();
		repository.commitTransaction();
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		repository.beginTransaction();
		repository.commitTransaction();
		return false;
	}
}
	