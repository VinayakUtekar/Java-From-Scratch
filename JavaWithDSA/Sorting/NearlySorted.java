package JavaWithDSA.Sorting;

import java.util.Scanner;

public class NearlySorted {
    static void nearlySorted(int a[], int n, int k) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < Math.min(k, n - i - 1); j++) {
                if (a[i] > a[i + j + 1]) {
                    // swap
                    int temp = a[i];
                    a[i] = a[i + j + 1];
                    a[i + j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        nearlySorted(a, n, k);
        sc.close();
    }
}
