package Basic.MathematicalProblems;

import java.util.Scanner;

public class AreaOfPerimeter {
    public static double peri(double l, double b){
        double res = 2*(l+b);
        return res;
    }

    public static void main(String args [] ){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(peri(l,b));
    }
}
