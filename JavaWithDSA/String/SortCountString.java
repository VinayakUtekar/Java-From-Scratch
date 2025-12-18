package JavaWithDSA.String;

import java.io.Console;

public class SortCountString {
    public static void main(String args[]){
        Console c = System.console();

        String str = c.readLine(" Enter a string : ");

        // Convert string to char array
        char[] charArray = str.toCharArray();

        // Sort the char array
        for(int i=0 ; i<charArray.length-1 ; i++){
            for(int j=i+1 ; j<charArray.length ; j++){
                if(charArray[i] > charArray[j]){
                    // Swap
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }

        // Count occurrences
        int count = 1;
        for(int i=0 ; i<charArray.length ; i++){
            if(i < charArray.length - 1 && charArray[i] == charArray[i+1]){
                count++;
            } else {
                System.out.println(charArray[i] + " : " + count);
                count = 1;
            }
        }
    }
}
