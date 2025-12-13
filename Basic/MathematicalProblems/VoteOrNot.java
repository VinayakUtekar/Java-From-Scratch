package Basic.MathematicalProblems;

import java.util.Scanner;

public class VoteOrNot {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String res = age >=18 ? "Can Vote" : "Cannot Vote";
        System.out.println("Your age is " + age + " so " + res);
    }
}
