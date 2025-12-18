package JavaWithDSA.String;

import java.io.Console;

public class CharacterCount {
    public static void main(String args[]){
        Console c = System.console();
        String str = c.readLine(" Enter a string : ");

        int c1=0, c2=0,c3=0;
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                c1++;
            }
            else if(Character.isDigit(ch)){
                c2++;
            }
            else{
                c3++;
            }
        }
        System.out.print("c1 = " + c1 +"  c2 = " + c2 + "  c3 = " + c3 );
    }
}
