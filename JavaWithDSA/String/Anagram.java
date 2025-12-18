package JavaWithDSA.String;

import java.io.Console;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Console console = System.console();

        String str1 = console.readLine("Enter first string: ");
        String str2 = console.readLine("Enter second string: ");

        char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        str1 = new String(c1);
        str2 = new String(c2);

        if(str1.equals(str2)){
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        
    }
}
