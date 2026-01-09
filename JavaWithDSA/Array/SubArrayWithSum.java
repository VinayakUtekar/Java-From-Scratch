package JavaWithDSA.Array;

import java.util.Scanner;

public class SubArrayWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int targetSum = sc.nextInt();
        for(int i=0; i<n; i++){
            int currentSum = 0;
            for(int j=i; j<n; j++){
                currentSum += arr[j];
                if(currentSum == targetSum){
                    System.out.println("Subarray found from index " + i + " to " + j);
                }
            }
        }
    }
}
