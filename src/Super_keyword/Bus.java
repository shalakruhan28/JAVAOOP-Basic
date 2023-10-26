package Super_keyword;

public class Bus extends Vehicle {
    String Regi;
    Bus(String n,String c,String r) {
        /*name=n;
          color=c;
         */
        super(n, c); // using super keyword.
        Regi = r;
    }
        void display(){
        /*sout(name)
          sout(color)
         */
            super.display();
            System.out.println("Registration Number of the Bus :"+Regi);

        }
    }

