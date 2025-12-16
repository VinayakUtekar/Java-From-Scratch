package OOPS.Polimorphisom.StaticPolimorphisom;

public class Area {
    public static void area(int side){
        Compute.area(5);
        Compute.area(4.5, 6.5);
    }
}

class Compute{
    public static void area(double radius){
        double res = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + res);
    }
    public static void area(double length, double breadth){
        double res = length * breadth;
        System.out.println("Area of Rectangle = " + res);
    }
}