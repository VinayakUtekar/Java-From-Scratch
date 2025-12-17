package OOPS.Constructor;

class Rectangle{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
    this.length = length;
    this.breadth = breadth;
    }

    public void showData(){
        System.out.println("Length :  " + length + " " + "   Breadth : " + breadth);
    }

    public void area(){
        double res = length * breadth;
        System.out.println("Area :  " + res);
    }

    public void perimeter(){
        double res = 2 * ( length * breadth);
        System.out.println("Perimeter :  " + res);
    }
}

public class P4{
    public static void main(String args[]){
        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);

        Rectangle r = new Rectangle(length,breadth);
        r.showData();
        r.area();
        r.perimeter();
    }
}