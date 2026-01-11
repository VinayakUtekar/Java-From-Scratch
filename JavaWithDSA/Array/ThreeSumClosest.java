package JavaWithDSA.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeSumClosest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    int diff = Math.abs(sum - target);
                    if(diff < min){
                        min = diff;
                        res = sum;
                    }
                }
            }
        }
        System.out.println(res);
    }
}