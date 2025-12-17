package OOPS.Constructor;

class Circle{
    //private static double PI = 3.1459; (for variables -> that is changeable)

    private static final double PI = 3.1459; // for constant just mention final
    private double radius;

    public Circle(double radius){
    this.radius = radius;
    }

    public void showData(){
        System.out.println("Radius : " + radius);
    }

    public void area(){
        double res = PI * radius;
        System.out.println("Area :  " + res);
    }

    public void circumference(){
        double res = 2 * PI * radius;
        System.out.println("Circumferenece :  " + res);
    }
}

class P2{
    public static void main(String args[]){
        double radius = Double.parseDouble(args[0]);

        Circle c = new Circle(radius);
        c.showData();
        c.area();
        c.circumference();
    }
}