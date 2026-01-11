package JavaWithDSA.Searching;

import java.util.Scanner;

public class BitonicPoint {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
