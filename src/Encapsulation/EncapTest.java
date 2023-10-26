package Encapsulation;

public class EncapTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Shalak");
        System.out.println("Name:"+p1.getName());
        p1.setAge(21);
        System.out.println("Age:"+p1.getAge());

        p1.setName("Ishraque");
        System.out.println("Name:"+p1.getName());
        p1.setAge(21);
        System.out.println("Age:"+p1.getAge());
    }
}
