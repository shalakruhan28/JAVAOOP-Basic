package Final_Keyword;

public class University {
    final String Uni="DIU";
    static final String Sem; //static final
    static { //static block
        Sem="5th";
    }
    final  int id; //blank final variable
    University(){ //constructor call variable
        id=835;
    }

    final int fee=31500;

    void display(){
        System.out.println(Uni);
        System.out.println(Sem);
        System.out.println(id);
        System.out.println(fee);
    }

}
