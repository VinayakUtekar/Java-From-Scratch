package OOPS.Encapsulation;

import java.util.Scanner;

class Circle{
    //instance variable
    //private so data only accessable in Student class
    private double radius;

    //public so data can be accessable in Student class an also form StudentTest2 class
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void showRadius(){
        System.out.println("Radius = " + this.radius );	
    }

    public void area(){
        double res = 3.14 * radius * radius;
        System.out.println("Area = " + res );
    }

    public void circumference(){
        double res = 2 * 3.14 * radius ;
        System.out.println("Circumference = " + res );
    }
}

public class P5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle c = new Circle();
        c.setRadius(radius);
        c.showRadius();
        c.area();
        c.circumference();
    }
}
