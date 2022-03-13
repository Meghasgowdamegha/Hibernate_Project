package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Employee;

public class IEmployeeRepositoryImpl implements IEmployeeRepository{
	
	private EntityManager entityManager;
	private Employee employee;
	public IEmployeeRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		entityManager.persist(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		entityManager.merge(employee);
		return employee;
	}

	@Override
	public Employee searchEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		return employee;
	}

	@Override
	public Employee deleteEmployee(int id) {
		entityManager.remove(id);
		return employee;
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}