package Basic.ConditionalStatements;

import java.util.Scanner;

public class EvenOddIfElse {
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        double n = sc.nextDouble();
        if(n%2 == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");       
        }
    }
}
