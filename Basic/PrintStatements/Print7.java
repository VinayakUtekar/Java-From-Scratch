package Basic.PrintStatements;
 
public class Print7 {
    public static void main(String [] args){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = a / b;
        System.out.println("The result of " + a + " divided by " + b + " is " + c);
        System.out.printf("The result of %.2f divided by %.2f is %.2f", a, b, c);
        System.out.format("The result of %.2f divided by %.2f is %.2f", a, b, c);
    }
}