package JavaWithDSA.Searching;

import java.util.Scanner;

public class LargestPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = a[i] + a[j];
                if (sum > largest) {
                    largest = sum;
                }
            }
        }
        System.out.println(largest);
    }
}
