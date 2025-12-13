package Basic.MathematicalProblems;

import java.util.Scanner;

public class AreaOfCircumference {
    public static double circum(double r){
        final double pi = 3.14;
        double res = 2 * pi * r;
        return res;
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(circum(r));
    }
}
