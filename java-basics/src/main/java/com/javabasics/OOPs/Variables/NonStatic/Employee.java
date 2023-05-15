package com.javabasics.OOPs.Variables.NonStatic;

//  Non-Static Variables belongs to each instance of a class rather than the class itself
//  Each instance of a class has its own copy/values of Non-Static Variable
//  Changes made to the Variable on one instance does not affect the Variable on other instances

public class Employee {

    private String name;
    private int age;
    private Long salary;

    public Employee(String name, int age, Long salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void EmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("Bill",52, 25000L);
        employee1.EmployeeDetails();

        Employee employee2 = new Employee("Steve", 50, 30000L);
        employee2.EmployeeDetails();
    }
}
