package com.javabasics.Objects.ReferenceVariable;

// Initializing Object through reference variable (employee)

public class EmployeeDetails {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 123;
        employee.name="abcd";
        System.out.println(employee.id+"\n"+employee.name);
    }
}
