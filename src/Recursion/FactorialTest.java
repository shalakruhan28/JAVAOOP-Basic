package Recursion;

public class FactorialTest {
    public static void main(String[] args) {

        Factorial f1= new Factorial();
        int result=f1.Fact(10);
        System.out.println("Factorial of 10 :"+result);

        result=f1.Fact(3);
        System.out.println("Factorial of 9 :"+result);


    }
}
