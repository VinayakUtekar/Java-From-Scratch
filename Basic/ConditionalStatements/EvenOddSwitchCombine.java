package Basic.ConditionalStatements;

import java.util.Scanner;

public class EvenOddSwitchCombine {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num % 2){
            case 0 : System.out.print("\n NUMBER IS EVEN");
                break;
            case 1,-1 : System.out.print("\n NUMBER IS ODD");
                    break;
        }
    }
}
