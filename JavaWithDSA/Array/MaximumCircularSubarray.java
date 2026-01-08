package JavaWithDSA.Array;

import java.util.Scanner;

public class MaximumCircularSubarray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            int sum = a[i];
            for(int j=i; j<a.length; j++){
                sum += a[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println("Maximum Circular Subarray Sum is: " + max);
    }
}
