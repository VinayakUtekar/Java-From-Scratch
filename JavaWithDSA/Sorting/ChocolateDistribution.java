package JavaWithDSA.Sorting;

import java.util.*;

public class ChocolateDistribution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Arrays.sort(a);
        int res = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            int r = a[i + m - 1] - a[i];
            res = Math.min(res,r);
        }
        System.out.println(res);
    }
}
