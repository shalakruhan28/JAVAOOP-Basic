package Static_keyword;

public class Car {
    String Name,Brand;
    static String Genre="JDM";

    Car (String n, String b){
        Name=n;
        Brand=b;
    }
    void display(){
        System.out.println("Model :"+Name);
        System.out.println("Brand Name:"+Brand);
        System.out.println("Genre :"+Genre);

    }
}
