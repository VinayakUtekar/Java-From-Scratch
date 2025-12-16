package Basic.Methods.MethodOverloading;

class Compute{
    public static void area(double radius){
        double res = 3.14 * radius *radius;
        System.out.println("AREA OF Circle = " + res);
    }

    public static void area(double length,double breadth){
        double res = length * breadth;
        System.out.println("AREA OF RECTANGLE = " + res);
    }
}
 
public class AreaMethodOverloading2 {
    public static void main(String args[]){
        Compute.area(4.5);
        Compute.area(10,20);
        Compute.area(10.5);
    }
}