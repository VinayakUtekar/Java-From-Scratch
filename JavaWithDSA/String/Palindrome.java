package JavaWithDSA.String;

import java.io.Console;

public class Palindrome{
    public static void main(String [] args){
        Console c = System.console();
        String s = c.readLine("Enter String : ");
        String r = "";
        for(int i=s.length()-1; i>=0 ; i--){
            char ch = s.charAt(i);
            r = r + ch;
        }
        if(s.equalsIgnoreCase(r)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}