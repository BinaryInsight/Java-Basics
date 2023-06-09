package com.javabasics.Collections.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {

    public static void main(String[] args) {

        Map<Integer,Employee> employeeMap = new HashMap<>();

        Employee employee1 = new Employee("Mark",1,10000L,"Application Developer");
        Employee employee2 = new Employee("Bill",2,8000L,"System Administrator");
        Employee employee3 = new Employee("Steve",3,10000L,"Application Developer");
        Employee employee4 = new Employee("Elon",4,10000L,"Application Developer");
        Employee employee5 = new Employee("James",5,8000L,"Data Analyst");
        Employee employee6 = new Employee("Rodriguez",6,5000L,"System Administrator");

        employeeMap.put(employee1.getId(), employee1);
        employeeMap.put(employee2.getId(), employee2);
        employeeMap.put(employee3.getId(), employee3);
        employeeMap.put(employee4.getId(), employee4);
        employeeMap.put(employee5.getId(), employee5);
        employeeMap.put(employee6.getId(), employee6);

        // print details of employees based on same salary and department
        employeeMap.entrySet().stream().filter(map -> map.getValue().getSalary() == 10000L)
                        .filter(map1 -> map1.getValue().getDepartment() == "Application Developer")
                        .forEach(e -> System.out.println(e.getValue()));
                }
    }
