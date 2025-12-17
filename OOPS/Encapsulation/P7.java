package OOPS.Encapsulation;

import java.util.Scanner;

public class P7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rno = sc.nextInt();
        int marks = sc.nextInt();
        int name = sc.next();
        Student s4 = new Student();
        s4.setData(rno,name,marks);
        s4.showData();
    }
}

class Student{
    //instance variable
    //private so data only accessable in Student class
    private int rno;
    private String name;
    private int marks;

    //public so data can be accessable in Student class an also form StudentTest2 class
    public void setData(int rno, String name, int marks){
        this.rno = rno;	
        this.name = name;
        this.marks = marks;
    }

    public void showData(){
        System.out.println("Roll no = " + rno + " Name = " + name + "Marks = " + marks);	
    }

    public void findGrade(){
        if((marks < 0)&&(marks > 100))
            System.out.println("INVALID INPUT");
        else if(marks > 80)
            System.out.println("Grade = A");
        else if(marks > 60)
            System.out.println("Grade = B");
        else if(marks > 40)
            System.out.println("Grade = C");
        else
            System.out.println("Grade = D");
    }
}