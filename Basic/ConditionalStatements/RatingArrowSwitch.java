package Basic.ConditionalStatements;

import java.util.Scanner;

public class RatingArrowSwitch {
    public static void main(String args[]){
        int rating = Integer.parseInt(args[0]);
        switch (rating){
            case 1,2 -> System.out.print("\n OK ");
                
            case 3,4 -> System.out.print("\n GOOD");
                
            case 5 -> System.out.print("\n EXCELLENT");
                
            default -> System.out.print("\n INVALID INPUT");
        }
    }
}