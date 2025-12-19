package JavaWithDSA.String;

import java.io.Console;

public class PalindromeUsingFunctions {
    public static void main(String [] args){
        Console c = System.console();
        String str = c.readLine("Enter a string: ");
        String rev = new StringBuffer(str).reverse().toString();
        if(str.equalsIgnoreCase(rev)){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
