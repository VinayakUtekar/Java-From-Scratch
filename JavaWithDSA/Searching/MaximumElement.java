package JavaWithDSA.Searching;

import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int larg = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }
        }
        System.out.println(larg);
    }
}
