package com.javabasics.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Kevin",1,10,"Maths");
        Student student2 = new Student("Mark",2,9,"Science");
        Student student3 = new Student("Zack",3,9,"Computers");
        Student student4 = new Student("Bill",4,10,"English");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        for(Student student : studentList) {
            if(student.getStandard() == 9) {  // gets all students whose standard is 9
                student.setStandard(10);      // sets all students to standard to 10
            }
            // prints updated list
            System.out.println(student.getName() + " " + student.getId() + " " + student.getStandard() + " " + student.getCourse());
        }
    }
}
