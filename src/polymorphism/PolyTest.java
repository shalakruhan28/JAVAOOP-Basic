package polymorphism;

public class PolyTest {
    public static void main(String[] args) {
         Person p=new Person();
         p.display();
         p= new Student();    // dynamic method dispatch
         p.display();
         p= new Teacher();    // dynamic method
         p.display();

         /*Dynamic Method Dispatch in Java is the process by which a call to an overridden method is resolved at
            runtime (during the code execution)*/

    }
}
