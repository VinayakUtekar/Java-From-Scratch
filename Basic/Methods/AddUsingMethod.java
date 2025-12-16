package Basic.Methods;

public class AddUsingMethod{
    public static void Add(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
    public static void main(String args []){
        System.out.println("Main Method Started");
        Add();
        System.out.println("Main Method Ended");
    }
}