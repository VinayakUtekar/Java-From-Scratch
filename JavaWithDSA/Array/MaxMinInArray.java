package JavaWithDSA.Array;

import java.io.Console;

public class MaxMinInArray {
    public static void main(String [] args){
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter the Array Size :"));
        int [] a = new int[n];
        int min=a[0], max=0;
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(c.readLine("Enter elements :"));
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
        System.out.println();
        System.out.println("Maximum Element : " + max);
        System.out.println("Minimum Element : " + min);
    }
}
