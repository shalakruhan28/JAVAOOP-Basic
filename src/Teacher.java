public class Teacher {
    String name,gender;
    int phone,age;

    void setinfo(String n,String g,int a,int p){ //parameterized Method
        name=n;
        gender=g;
        age=a;
        phone=p;
    }
    void  displayinfo(){  //mathod
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Age :"+age);
        System.out.println("Phone :"+phone);

    }

}
