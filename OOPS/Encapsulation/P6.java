package OOPS.Encapsulation;

class Rectangle{
    //instance variable
    //private so data only accessable in Student class
    private double length,breadth ;

    //public so data can be accessable in Student class an also form StudentTest2 class
    public void setData(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void showData(){
        System.out.println("Length = " + this.length + " Breadth = " + this.breadth);	
    }

    public void area(){
        double res = length * breadth;
        System.out.println("Area = " + res );
    }

    public void perimeter(){
        double res = 2 * (length + breadth) ;
        System.out.println("perimeter = " + res );
    }
}



// class 
public class P6 {
    public static void main(String args[]){
        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);
        Rectangle r = new Rectangle();
        r.setData(length,breadth);
        r.showData();
        r.area();
        r.perimeter();
    }
}