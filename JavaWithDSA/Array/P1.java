package JavaWithDSA.Array;

import java.io.Console;

public class P1 {
    public static void main(String [] args){
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter the Array Size :"));
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(c.readLine("Enter elements :"));
        }
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
