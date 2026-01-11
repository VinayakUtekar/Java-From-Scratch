package JavaWithDSA.Searching;

import java.util.Scanner;

public class MissingRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = new int[n + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int repeating = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                repeating = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }
        System.out.println("Repeating number: " + repeating);
        System.out.println("Missing number: " + missing);
    }
}