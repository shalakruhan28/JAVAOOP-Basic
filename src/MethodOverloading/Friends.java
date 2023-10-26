package MethodOverloading;

public class Friends {
    String name,Gender,University;
    int age;

    Friends(){
        System.out.println("No Information !");
    }
    Friends(String n,String g,String U){
          name =n;
          University=U;
          Gender=g;
    }
    Friends(String n,String g,String U,int a){
         name=n;
         Gender=g;
         University=U;
          age=a;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Gender:"+Gender);
        System.out.println("University:"+University);
        System.out.println("Age:"+age);
    }
}
