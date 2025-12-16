package Basic.Methods.MethodOverloading;

class Compute{
    public void area(double radius){
        double res = 3.14 * radius *radius;
        System.out.println("AREA OF Circle = " + res);
    }

    public void area(double length,double breadth){
        double res = length * breadth;
        System.out.println("AREA OF RECTANGLE = " + res);
    }
}
 
public class AreaMethodOverloading {
    public static void main(String args[]){
        Compute c = new Compute();
        c.area(4.5);
        c.area(10,20);
        c.area(10.5);
    }
}