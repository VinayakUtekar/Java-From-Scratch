package Basic.Methods;

public class MethodCall1{
    public static void display(){
        System.out.println("Display Method Called");
    }
    public static void main(String args []){
        System.out.println("Main Method Started");
        display();
        System.out.println("Main Method Ended");
    }
}