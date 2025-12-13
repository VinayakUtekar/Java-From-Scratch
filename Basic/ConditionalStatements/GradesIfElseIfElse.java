package Basic.ConditionalStatements;

import java.util.Scanner;

public class GradesIfElseIfElse {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        double marks = sc.nextDouble();
        if(marks<0 | marks>100){
            System.out.println("Invalid Marks");
        }
        else if(marks>=80){
            System.out.println("Grade A");
        }
        else if(marks>=60){
            System.out.println("Grade B");
        }
        else if(marks>=35){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade F");
        }
    }
}
