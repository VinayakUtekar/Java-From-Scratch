package JavaWithDSA.Sorting;

import java.util.Scanner;

public class MissingElementInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int h = sc.nextInt();
        for (int num = l; num <= h; num++) {
            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (a[i] == num) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.print(num + " ");
            }
        }
    }
}
