package MethodOverloading;

public class BestFriend {
    public static void main(String[] args) {

        Friends f1=new Friends();
        System.out.println( );

        Friends f2= new Friends("Shezan","Male","EWU");
        f2.display();
        System.out.println();
        Friends f3=new Friends("Samantha Shuchi","Female","NBMC",21);
        f3.display();
    }
}
