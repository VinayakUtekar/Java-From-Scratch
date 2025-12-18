package JavaWithDSA.String;

import java.io.Console;

public class CharacterIdentifyerUsingFunction {
    public static void main(String [] args){
        Console c = System.console();
        String s = c.readLine("Enter a character : ");
        char ch = s.charAt(0);
        if(Character.isLetter(ch)){
            System.out.printf("%c is an Alphabet ", ch);
        }
        else if (Character.isDigit(ch)){
            System.out.printf("%c is a Digit ", ch);
        }
        else{
            System.out.printf("%c is a Special Character ", ch);
        }
    }
}
