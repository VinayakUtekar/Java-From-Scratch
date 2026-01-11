package JavaWithDSA.Searching;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int larg = Integer.MIN_VALUE;
        int secondLarg = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > larg) {
                secondLarg = larg;
                larg = arr[i];
            }
            else if (arr[i] > secondLarg && arr[i] != larg) {
                secondLarg = arr[i];
            }
        }
        System.out.println(secondLarg);
    }
}