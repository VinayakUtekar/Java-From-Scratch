package Basic.Loops;

import java.util.Scanner;

public class SumIntegerCompoundWhileLoop {
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        if (num > 0){
            int i = 1,sum = 0;
            while(i<=num)
            {
                sum += i;
                i += 1;
            }
            System.out.print("\n SUM OF NUMBERS IS : " + sum);
        }
        else{
            System.out.print("\n INVALID INPUT");
        }
    }
}