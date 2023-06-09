package com.javabasics.Collections.List.ArrayList;


public class Student {

    private String name;
    private Integer id;
    private Integer standard;
    private String course;

    public Student(String name, Integer id, Integer standard, String course) {
        this.name=name;
        this.id=id;
        this.standard=standard;
        this.course=course;
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

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard=standard;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course=course;
    }
}
