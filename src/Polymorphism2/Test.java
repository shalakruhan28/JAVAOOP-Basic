package Polymorphism2;

public class Test {
    public static void main(String[] args) {

        Shape[] S=new Shape[3];


        S[0]=new Shape();
        S[1]=new Rectangle(10,20);
        S[2]=new Triangle(10,20);

        for (int i=0;i<3;i++){
            System.out.println( S[i].area());
        }




      /*  Shape s=new Shape();
        s.area();
        Rectangle r=new Rectangle(10,20);
        r.area();
        Triangle t=new Triangle(10,20);
        t.area();

        System.out.println( S[0].area());
        System.out.println( S[1].area());
        System.out.println( S[2].area());

       */
    }
}
