package OOPS.Constructor;

class Student{

    private int rno;
    private String name;;
    private int p;
    private int c;
    private int m;

    public void setData(int rno, String name, int p, int c, int m){
    this.rno = rno;
    this.name = name;
    this.p = p;
    this.c = c;
    this. m = m;
    }

    public void showData(){
        System.out.println("rno = " + rno + " name = " + name + "    "+ " marks = " + p + " " + c + " " + m);
    }

    public void findAvg(){
        double avg = (p + c+ m) /3;
        System.out.println("Average =" + avg);
    }
}
public class P5{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setData(10, "neha", 99, 44 ,88);
        s1.showData();
        s1.findAvg();

        Student s2 = new Student();
        s2.setData(20, "pooja", 99, 66 ,44);
        s2.showData();
        s2.findAvg();
    }
}