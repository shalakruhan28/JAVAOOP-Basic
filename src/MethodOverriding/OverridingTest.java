package MethodOverriding;

public class OverridingTest {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.name = "Anisul";
        t1.age = 27;
        t1.Qualification = ("Bsc in Cse");
        t1.display();
        System.out.println();
        Person p1 = new Person();
        p1.name = "Ryian Janik";
        p1.age = 25;
        p1.display();
    }
}
