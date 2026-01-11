package JavaWithDSA.Searching;

import java.util.Scanner;

public class ThirdLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int larg = Integer.MIN_VALUE;
        int secondLarg = Integer.MIN_VALUE;
        int thirdLarg = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > larg) {
                thirdLarg = secondLarg;
                secondLarg = larg;
                larg = arr[i];
            }
            else if (arr[i] > secondLarg && arr[i] != larg) {
                secondLarg = arr[i];
                thirdLarg = secondLarg;
            }
            else if (arr[i] > thirdLarg && arr[i] != secondLarg && arr[i] != larg) {
                thirdLarg = arr[i];
            }
        }
        System.out.println(larg + " " + secondLarg + " " + thirdLarg);
    }
}