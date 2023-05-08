package com.javabasics.Objects.Method;

// Initializing Object through Methods (createDeveloper & getDeveloper)
public class DeveloperDetails {

    public static void main(String[] args) {
        Developer d1 = new Developer();
        Developer d2 = new Developer();
        d1.createDeveloper(1,"Bill","Frontend Developer");
        d2.createDeveloper(2,"Steve", "Backend Developer");
        d1.getDeveloper();
        d2.getDeveloper();
    }
}
