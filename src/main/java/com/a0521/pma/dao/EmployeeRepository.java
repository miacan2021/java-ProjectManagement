package com.a0521.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.a0521.pma.entity.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	@Override
	public List<Employee> findAll();
}