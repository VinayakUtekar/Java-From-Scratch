package JavaWithDSA.Searching;

import java.util.Scanner;

public class FloorOfArray {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr1[i] <= target) {
                System.out.println(arr1[i]);
                break;
            }
        }
    }
}
