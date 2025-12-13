package Basic.Operators;

import java.util.Scanner;

public class TernanryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result); 
    }
}
