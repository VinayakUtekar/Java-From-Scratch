package JavaWithDSA.Searching;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length + 1; 
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        int missingNumber = totalSum - arrSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
