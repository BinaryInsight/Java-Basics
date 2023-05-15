package com.javabasics.OOPs.Objects.Method;

// Initializing Object through Methods (createDeveloper & getDeveloper)

public class Developer {

    int id;
    String name;
    String role;

    void createDeveloper(int i, String n, String r) {
        id=i;
        name=n;
        role=r;
    }

    void getDeveloper() {
        System.out.println(id+" "+name+" "+role);
    }

}
