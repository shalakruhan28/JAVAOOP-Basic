package varargs;

public class AddTest {
    public static void main(String[] args) {

        AddDemo a1= new AddDemo();
        a1.add(10,20);
        a1.add(10,20,40);
        a1.add(10,20,30,40,50);
        a1.add(10,20,80);

        }
    }

