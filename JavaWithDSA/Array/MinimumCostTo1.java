package JavaWithDSA.Array;

import java.util.Scanner;

public class MinimumCostTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i : arr){
            if(i < min){
                min = i;
            }
        }
        System.out.println(min*(n-1));
    }
}
