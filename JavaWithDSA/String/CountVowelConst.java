package JavaWithDSA.String;

import java.io.Console;

public class CountVowelConst {
    public static void main(String [] args){
        Console c = System.console();
        StringBuffer sb = new StringBuffer(c.readLine("Enter a string: "));
        int vCount = 0, cCount = 0;
        for(int i=0;i<sb.length();i++){
            char ch = Character.toLowerCase(sb.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vCount++;
            }
            else if((ch>='a' && ch<='z')){
                cCount++;
            }
        }
        System.out.println("Vowel count: " + vCount);
        System.out.println("Consonant count: " + cCount);
    }
}
