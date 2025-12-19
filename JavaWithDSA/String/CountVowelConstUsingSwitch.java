package JavaWithDSA.String;

import java.io.Console;

public class CountVowelConstUsingSwitch {
    public static void main(String [] args){
        Console c = System.console();
        StringBuffer sb = new StringBuffer(c.readLine("Enter a string: "));
        int vCount = 0, cCount = 0;
        for(int i=0;i<sb.length();i++){
            char ch = Character.toLowerCase(sb.charAt(i));
            switch(ch){
                case 'a','e','i','o','u' -> vCount++;
                default -> cCount++;
            }
        }
        System.out.println("Vowel count: " + vCount);
        System.out.println("Consonant count: " + cCount);
    }
}
