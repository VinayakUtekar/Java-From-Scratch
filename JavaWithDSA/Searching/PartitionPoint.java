package JavaWithDSA.Searching;

import java.util.Scanner;

public class PartitionPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int larg = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = i + 1; j < n; j++) {
                if(a[j] < min) {
                    min = a[j];
                }
            }
            for (int k = 0; k < i; k++) {
                if(a[k] > larg) {
                    larg = a[k];
                }
            }
            if(larg<=a[i] && min>=a[i]) {
                System.out.println(a[i]);
                break;
            }
        }
    }
}
