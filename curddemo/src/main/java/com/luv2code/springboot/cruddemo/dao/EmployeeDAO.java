package com.luv2code.springboot.curddemo.dao;

import java.util.List;

import com.luv2code.springboot.curddemo.entity.Employee;

public interface EmployeeDAO {

    public List<Employee> findAll();

}
