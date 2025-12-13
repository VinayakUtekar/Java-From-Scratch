package Basic.MathematicalProblems;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dollar = scanner.nextDouble();
        double inr = dollar * 82.0;
        System.out.println(dollar + " USD is equal to " + inr + " INR.");
    }
}
