package JavaWithDSA.String;

import java.io.Console;

public class CharacterCount2 {
    public static void main(String args[]){
        Console c = System.console();
        String str = c.readLine(" Enter a string : ");

        int lc=0, uc=0,dc=0,sc=0;
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                uc++;
            }
            else if(Character.isLowerCase(ch)){
                lc++;
            }
            else if(Character.isDigit(ch)){
                dc++;
            }
            else{
                sc++;
            }
        }
        System.out.println(" Uppercase characters : " + uc);
        System.out.println(" Lowercase characters : " + lc);
        System.out.println(" Digit characters     : " + dc);
        System.out.println(" Special characters   : " + sc);
    }
}
