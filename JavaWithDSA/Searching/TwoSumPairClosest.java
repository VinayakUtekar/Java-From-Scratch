package JavaWithDSA.Searching;

import java.util.*;

public class TwoSumPairClosest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int [] res = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr1[i] + arr1[j];
                int diff = Math.abs(k - sum);
                if (diff < min) {
                    min = diff;
                    res[0] = arr1[i];
                    res[1] = arr1[j];
                }
            }
        }
        System.out.println(res[0] + " " + res[1]);
    }
}
