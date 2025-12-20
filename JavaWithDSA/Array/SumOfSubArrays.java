package JavaWithDSA.Array;

import java.util.Scanner;

public class SumOfSubArrays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    sum = sum + arr[k];
                }
            }
        }
        System.out.println("The sum of all subarrays is: " + sum);
    }
}