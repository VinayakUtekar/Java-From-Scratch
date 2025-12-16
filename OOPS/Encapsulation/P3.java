package OOPS.Encapsulation;

import java.util.Scanner;

class Rectangle{
    //variable (instence variable)(state)
    double length, breadth;

    //Method
    void setData( double l , double b){
        length = l;
        breadth = b;
    }

    //Method
    void Display(){
        System.out.println("\n Length =" + length + " " + " Breath =" + breadth );
    }

    //Method
    void area(){
        double res = length * breadth;
        System.out.println("\n AREA = " + res);
    }
    //Method
    void perimeter(){
        double res = 2*( length + breadth);
        System.out.println("\n PERIMETER = " + res);
    }
}
class P3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        //object 1
        Rectangle r = new Rectangle(); //new used for memory/address alloaction  Rectangle() here ()is constructor
        r.setData(length,breadth);
        r.Display();
        r.area();
        r.perimeter();
    }
}