package Basic.ConditionalStatements;

import java.util.Scanner;

public class AreaCircleIfElse {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        final double pi = 3.1469;
        double r = sc.nextDouble();
        if(r > 0){
            System.out.println("Area : " + pi*r*r);
        }
        else{
            System.out.println("Invalid Input kindly try again");
        }
    }
}