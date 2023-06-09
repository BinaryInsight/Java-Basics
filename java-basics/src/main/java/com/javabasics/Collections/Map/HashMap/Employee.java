package com.javabasics.Collections.Map.HashMap;

public class Employee {
        private String name;
        private Integer id;
        private Long salary;
        private String department;

        public Employee(String name, Integer id, Long salary, String department) {
            this.name=name;
            this.id=id;
            this.salary =salary;
            this.department =department;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name=name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
