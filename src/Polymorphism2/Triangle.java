package Polymorphism2;

public class Triangle extends Shape{
    double height,base;

    Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }
     double area(){
         System.out.print("Triangle:");
        return 0.5*base*height;
     }
}
