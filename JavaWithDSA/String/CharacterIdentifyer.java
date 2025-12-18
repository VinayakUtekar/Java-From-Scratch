package JavaWithDSA.String;

import java.io.Console;

public class CharacterIdentifyer {
    public static void main(String [] args){
        Console c = System.console();
        String s = c.readLine("Enter a character : ");
        char ch = s.charAt(0);
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
            System.out.printf("%c is an Alphabet ", ch);
        }
        else if (ch>='0' && ch<='9'){
            System.out.printf("%c is a Digit ", ch);
        }
        else{
            System.out.printf("%c is a Special Character ", ch);
        }
    }
}
