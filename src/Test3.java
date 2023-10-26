public class Test3 {

    public static void main(String[] args) {
        Teacher t1= new Teacher(); //Object for t1

        t1.setinfo("Anisul Islam","Male",28,7243); //parameterized Method
        t1.displayinfo();//method call
        Teacher t2= new Teacher(); //object for t2
        System.out.println();

        t2.setinfo("JN Islam","Male",35,343875);  //parameterized Method
        t2.displayinfo();

    }
}



