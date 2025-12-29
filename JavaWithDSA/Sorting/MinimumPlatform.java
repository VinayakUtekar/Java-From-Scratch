package JavaWithDSA.Sorting;

import java.util.*;

public class MinimumPlatform{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] d = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            int c = 1;
            for(int j=0; j<n; j++){
                if(i!=j){
                    if(a[i] >= a[j] && d[j] >= d[i]){
                        c++;
                    }
                }
            } 
            res = Math.max(res, c); 
        }
        System.out.println(res);
    }
}