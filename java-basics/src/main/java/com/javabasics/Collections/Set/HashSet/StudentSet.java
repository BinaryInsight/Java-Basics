package com.javabasics.Collections.Set.HashSet;

import com.javabasics.Collections.List.ArrayList.Student;
import java.util.HashSet;
import java.util.Set;

public class StudentSet {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        Student student1 = new Student("John",1,6,"Mathematics");
        Student student2 = new Student("Emma",2,7,"Computers");
        Student student3 = new Student("Mike",3,6,"computers");
        Student student4 = new Student("Sophia",4,8,"Computers");
        Student student5 = new Student("Carl",5,6,"COMPUTERS");
        Student student6 = new Student("Jones",6,7,"Science");

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        studentSet.add(student6);

        String requiredCourse = "Computers";        // require students having this course

        for(Student student : studentSet) {
            if(student.getCourse().equalsIgnoreCase(requiredCourse)) {  // checks for students having required course
                // prints all the students having the required course
                System.out.println(student.getName() + " " + student.getId() + " " + student.getStandard() + " " + student.getCourse());
            }
        }
    }
}
