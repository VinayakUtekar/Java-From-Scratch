package OOPS.Encapsulation;

class Student{
    //instance variable
    int rno;
    String name;

    void setData(int rno, String name){
        this.rno = rno;	
        this.name = name;
    //when instance varible and local varibles have same names we use this.varable name to differentate betwwen local and instance variable
    }

    void showData(){
        System.out.println("Roll no = " + this.rno + " Name = " + this.name );	
    }
}

public class P10 {
    public static void main(String args[])
    {
        Student s2 = new Student();
        s2.showData();
        s2.setData(10 , "Vinayak");
        s2.showData();
    }
}
