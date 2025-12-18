package JavaWithDSA.Array;

import java.io.Console;

public class CountPosNeg0 {
    public static void main(String [] args){
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter the Array Size :"));
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(c.readLine("Enter elements :"));
        }
        int pc=0, nc=0, zc=0;
        for(int i : a){
            if(i>0)
                pc++;
            else if(i<0)
                nc++;
            else
                zc++;
        }
        System.out.println();
        System.out.println("Positive Count : " + pc);
        System.out.println("Negative Count : " + nc);
        System.out.println("Zero Count : " + zc);
    }
}
