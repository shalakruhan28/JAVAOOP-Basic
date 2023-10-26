package Oop1;

public class Student {
    String name;
    int id,age;
    Student(String n,int i,int a) { //parameterized Constructor
        name = n;
        id = i;
        age = a;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Age:"+age);
    }
}



