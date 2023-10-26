package varargs;

public class AddDemo {
    void add(int ... num){ // variable length arguments
        int sum=0;
        for (int X:num) {
            sum=sum+X;
        }
        System.out.println(sum);
    }

}
