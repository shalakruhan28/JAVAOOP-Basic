package ProblemSolving;

public class Box {
    double height,weidth,depth;
    Box(double h,double w,double d){
        height=h;
        weidth=w;
        depth=d;
    }
    void displyVol(){
       double Vol=height*weidth*depth;
        System.out.println("Volume:"+Vol  );

    }
}
