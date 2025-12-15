package Basic.ConditionalStatements;

import java.util.Scanner;

public class RatingSwitch {
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        int rating = Sc.nextInt();
        switch (rating){
            case 1,2 : System.out.print("\n OK ");
                break;
            case 3,4 : System.out.print("\n GOOD");
                break;
            case 5 : System.out.print("\n EXCELLENT");
                break;
            default : System.out.print("\n INVALID INPUT");
        }
    }
}
