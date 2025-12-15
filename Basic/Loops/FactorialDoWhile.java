package Basic.Loops;

import java.util.Scanner;

public class FactorialDoWhile {

    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        if(num >= 0){
            double i = 1, fact = 1;
            do{
                fact = fact * i;
                i = i + 1;
            }while( i <= num);
            System.out.println("\n FACTORIAL OF " + num + " IS : " + fact);
        }
        else{
            System.out.println("\n INVALID INPUT ");
        }
    }
}