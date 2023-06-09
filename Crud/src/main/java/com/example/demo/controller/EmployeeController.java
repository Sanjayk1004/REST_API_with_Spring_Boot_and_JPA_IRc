package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping()
public class EmployeeController {
	public EmployeeService es;
	public EmployeeController(EmployeeService es)
	{
		super();
		this.es=es;
	}
	@PostMapping("/emp")
    public ResponseEntity<Employee>saveemployee(@RequestBody Employee e)
    {
    	return new ResponseEntity<Employee>(es.saveemployee(e),HttpStatus.CREATED);
    }
	@GetMapping("/get/{id}")
	public Optional<Employee> getAllEmp(@PathVariable("id") int id)
	{
		return es .getAllEmp(id);
	}
	
	@PutMapping("/put")
	public Employee updateDetails(@RequestBody Employee e)
	{
		
		return es.updateInfo(e);
	}
	@DeleteMapping("/del/{id}")
	public void deleteDetails(@PathVariable ("id") int id)
	{
		es.deleteInfo(id);
	}
}
