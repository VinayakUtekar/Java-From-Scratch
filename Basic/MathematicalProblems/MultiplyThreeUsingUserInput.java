package Basic.MathematicalProblems;

public class MultiplyThreeUsingUserInput {
    public static double multiply(double a, double b, double c) {
        double result = a * b * c;
        return result;    
    }
    public static void main(String[] args) {
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);
        double product = multiply(num1, num2, num3);
        System.out.println("The product of " + num1 + ", " + num2 + ", and " + num3 + " is: " + product);
    }
}
