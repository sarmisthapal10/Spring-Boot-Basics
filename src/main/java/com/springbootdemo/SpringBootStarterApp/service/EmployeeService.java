package com.springbootdemo.SpringBootStarterApp.service;

import com.springbootdemo.SpringBootStarterApp.model.Employee;

public class EmployeeService {

    private List<Employee> employeeList;

    // Method to return the list
    // of employees
    public List<Employee> getEmployeeList()
    {

        if (employeeList == null) {

            employeeList
                    = new ArrayList<>();


        }

        return employeeList;


    }

    public void
    setEmployeeList(
            List<Employee> employeeList)
    {
        this.employeeList
                = employeeList;
    }
}
