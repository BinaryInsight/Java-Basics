package com.javabasics.Polymorphism;

// Here, Splendor class extends Bike class and overrides its "run()" method

public class Splendor extends Bike {

    void run() {
        System.out.println("running at 60kmph");
    }

    public static void main(String[] args){

        Bike bike = new Splendor();     // overrides run() method of Bike
        bike.run();                     // outputs run() method of Splendor

/*        Bike bike = new Bike();
          bike.run();                     // outputs run() method of Bike */
    }
}
