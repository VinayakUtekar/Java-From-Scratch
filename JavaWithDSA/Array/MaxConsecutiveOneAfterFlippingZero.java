package JavaWithDSA.Array;

import java.util.Scanner;

public class MaxConsecutiveOneAfterFlippingZero {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int s=0,e=0,c=0,res=0;
        while (e<arr.length){
            if(arr[e] == 0)
                c++;
            while(c>k){
                if(arr[s]==0){
                    c--;
                }
                s++;
            }
            res = Math.max(res,(e-s+1));
            e++;
        }

        System.out.println(res);
    }
}
