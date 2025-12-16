package OOPS.Encapsulation;

class Student{
    //variable (instence variable)(state)
    int rno;
    String name;

    //Method
    void setData( int r, String n){
        rno = r;
        name = n;
    }
    //Method
    void showData(){
        System.out.println(rno + " " + " " + name);
    }
}

public class P1{
    public static void main(String args[])
    {
        //object 1
        Student s1 = new Student();
        s1.setData(10 , "Amit");
        s1.showData();

        //object 2
        Student s2 = new Student();
        s2.setData(20 , "Neha");
        s2.showData();
    }
}