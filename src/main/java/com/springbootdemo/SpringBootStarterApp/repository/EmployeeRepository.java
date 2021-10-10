package com.springbootdemo.SpringBootStarterApp.repository;

import com.springbootdemo.SpringBootStarterApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
