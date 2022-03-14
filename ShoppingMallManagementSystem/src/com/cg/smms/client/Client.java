package com.cg.smms.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.smms.entities.Employee;

import com.cg.smms.entities.Shop;
import com.cg.smms.service.IEmployeeService;
import com.cg.smms.service.IEmployeeServiceImpl;
import com.cg.smms.service.IShopService;
import com.cg.smms.service.IShopServiceImpl;

public class Client {
    public static void main(String[] args) {
	
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
    EntityManager em = factory.createEntityManager();
    
    em.getTransaction().begin();
        
    //Creating one shop
	Shop shop = new Shop();
	shop.setShop_id(100);
	shop.setShopCategory("Stationary");
	shop.setShopEmployeeId("Employee");
	shop.setShopName("Reliance");
	shop.setCustomer("Ram");
	shop.setShopStatus("Top branded");
	shop.setShopOwner("ShopOwner");
	shop.setLeaseStatus("property");
	em.persist(shop);
	
	//creating one employee
	Employee employee = new Employee();
	employee.setId(101);
	employee.setName("Navya");
	employee.setDob(12-03-1998);
	employee.setSalary(50000);
	employee.setAddress("3rd block Jayanagar");
	employee.setDesignation("system Engineer");
	em.persist(employee);
	
	IShopService service = new IShopServiceImpl();
	service.addShop(shop);
	
	em.getTransaction().commit();
	
	System.out.println("one shop entry and one employee entry is completed");
	}
}
	