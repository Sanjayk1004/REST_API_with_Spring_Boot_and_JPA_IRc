package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface Empservice {
 Employee saveemployee(Employee emp);
 Employee updateInfo(Employee emp);
 void deleteInfo(int id);
 
}
