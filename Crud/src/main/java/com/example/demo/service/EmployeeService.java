package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmployeeService implements Empservice{
	private EmpRepository er;
    public EmployeeService(EmpRepository er)
    {
    	super();
    	this.er=er;
    }
    public Employee saveemployee(Employee emp)
    {
    	return er.save(emp);
    }
	public Optional<Employee> getAllEmp(int id) {
		return er.findById(id);
	
	}
	public Employee updateInfo(Employee iu)
	{
		return er.save(iu);
	}
	public void deleteInfo(int id)
	{
		er.deleteById(id);
	}
}
