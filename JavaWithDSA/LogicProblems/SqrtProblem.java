package JavaWithDSA.LogicProblems;

import java.io.Console;

public class SqrtProblem {
    public static void main(String args[]){
        Console c = System.console();

        double num = Double.parseDouble(c.readLine("Enter the number : "));
        if (num >= 0.0){
            double res = Math.sqrt(num);
            System.out.printf("Result =  %.2f ", res);
        }
        else{
            System.out.printf("Innvalid Input ");
        }
    }
}
