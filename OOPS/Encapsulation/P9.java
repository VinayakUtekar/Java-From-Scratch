package OOPS.Encapsulation;

class Student{
    //instance variable
    int rno;
    String name;

    void setData(int r, String n){
        rno = r;	
        name = n;
    }

    void showData(){
        System.out.println("Roll no = " + rno + " Name = " + name );	
    }
}
public class P9 {
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.showData();
        s1.setData(10 , "Vinayak");
        s1.showData();
    }
}
