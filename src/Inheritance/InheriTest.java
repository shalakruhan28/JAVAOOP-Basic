package Inheritance;

public class InheriTest {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.name = "Akash Ghosh";
        t1.age = 25;
        t1.Qualification = "Bsc in Cse";

        t1.display1();
        t1.display2();
        System.out.println();
        Teacher t2 = new Teacher();
        t2.name = "Anisul Islam";
        t2.age = 30;
        t2.Qualification = "Msc in Cse";

        t2.display1();
        t2.display2();
    }
}
