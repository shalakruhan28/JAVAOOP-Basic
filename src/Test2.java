public class Test2 {

    public static void main(String[] args) {
            Teacher t1= new Teacher();
            t1.name="Anisul Islam";
            t1.gender="Male";
            t1.age=28;
            t1.phone=723432;
            //t1.setinfo("Anisul Islam","Male",28,7243);
            t1.displayinfo();//method call
            Teacher t2= new Teacher();
            System.out.println();
            t2.name="JN Islam";
            t2.gender="Male";
            t2.age=35;
            t2.phone=3128432;
            t2.displayinfo();

        }
    }


