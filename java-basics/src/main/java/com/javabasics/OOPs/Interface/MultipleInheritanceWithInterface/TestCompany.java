package com.javabasics.OOPs.Interface.MultipleInheritanceWithInterface;

//  Multiple Inheritance can be achieved using Interfaces
//  By implementing multiple interfaces, you can inherit and use the features defined by each interface, allowing for a form of multiple inheritance in java

public class TestCompany {

/*    Here, we have three interfaces each declaring a single method (typeA,typeB,typeC).
    The Company class is able to inherit and implement all the three interfaces, thus achieving multiple inheritance    */


    public static void main(String[] args) {

        Company company = new Company();
        company.typeA();
        company.typeB();
        company.typeC();
    }
}
