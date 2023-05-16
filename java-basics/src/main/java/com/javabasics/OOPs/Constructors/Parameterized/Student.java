package com.javabasics.OOPs.Constructors.Parameterized;

//  Constructor is a block of code similar to method. It is called when an instance of the class is created
//  It is a special type of method used to initialize the object
//  Every time an object is created using the new() keyword, at least one constructor is called
//  Default constructor is created, when there is no constructor is available in the class

public class Student {

    int id;
    String name;

    Student(int i, String n) {      // creating parameterized constructor
        id=i;
        name=n;
    }

    void details() {                // method to display values
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Student student = new Student(1,"Jake");    // creating objects and passing values
        Student student1 = new Student(2,"Logan");

        student.details();      // calling method to display values of object
        student1.details();
    }
}
