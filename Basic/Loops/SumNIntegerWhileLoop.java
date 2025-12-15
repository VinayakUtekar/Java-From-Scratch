package Basic.Loops;

import java.util.Scanner;

public class SumNIntegerWhileLoop {
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        if (num > 0){
            int i = 1;
            int sum = 0;
            while(i<=num)
            {
                sum = sum +i;
                i = i + 1;
            }
            System.out.print("\n SUM OF NUMBERS IS : " + sum);
        }
        else{
            System.out.print("\n INVALID INPUT");
        }
    }
}