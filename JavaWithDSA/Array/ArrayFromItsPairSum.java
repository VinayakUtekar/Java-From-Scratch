package JavaWithDSA.Array;

import java.util.Scanner;

public class ArrayFromItsPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int n = 0;
        while (n * (n - 1) / 2 < m) {
            n++;
        }
        int[] res = new int[n];
        if (n == 2) {
            res[0] = 1;
            res[1] = arr[0] - 1;
        } else {
            res[0] = (arr[0] + arr[1] - arr[2]) / 2;
            for (int i = 1; i < n; i++) {
                res[i] = arr[i - 1] - res[0];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}