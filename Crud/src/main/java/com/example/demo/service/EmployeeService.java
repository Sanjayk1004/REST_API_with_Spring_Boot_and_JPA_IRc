package com.example.demo.service;

import java.util.List;

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
	@Override
	public List<Employee> getAllEmp() {
		return er.findAll();
	
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
