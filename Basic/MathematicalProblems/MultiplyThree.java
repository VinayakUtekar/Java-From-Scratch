package Basic.MathematicalProblems;

public class MultiplyThree {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double result = a * b * c;
        System.out.println("The product of " + a + ", " + b + ", and " + c + " is: " + result);
        System.out.printf("Formatted result: %.2f\n", result);
        System.out.format("Scientific notation: %.2e\n", result);
    }
}
