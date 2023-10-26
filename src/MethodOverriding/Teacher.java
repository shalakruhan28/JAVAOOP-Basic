package MethodOverriding;

import Inheritance.Person;

public class Teacher extends Person {
    String Qualification;

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Qualification:" + Qualification);
    }

}


