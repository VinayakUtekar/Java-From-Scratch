package JavaWithDSA.Array;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int l = arr.length, sum=0;
        for(int i : arr){
            sum = sum + i;
        }
        int sum2 = (l+1)*(l+2)/2;
        System.out.println(sum2 - sum);
    }
}
