package Basic.InputOutput;

import java.io.*;

public class ConsoleInput {
    public static void main(String [] args) throws IOException{
        Console console = System.console();
        int a = Integer.parseInt(console.readLine("Enter first number: "));
        int b = Integer.parseInt(console.readLine("Enter second number: "));
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}