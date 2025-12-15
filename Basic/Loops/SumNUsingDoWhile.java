package Basic.Loops;

import java.util.Scanner;

public class SumNUsingDoWhile {

    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        if(num > 0){
            int i = 1, sum = 0;
            do{
                sum = sum + i;
                i = i + 1;
            }while( i <= num);
            System.out.println("\n Sum IS : " + sum);
        }
        else{
            System.out.println("\n INVALID INPUT ");
        }
    }
}