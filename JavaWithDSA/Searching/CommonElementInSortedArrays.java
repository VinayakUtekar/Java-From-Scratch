package JavaWithDSA.Searching;

import java.util.Scanner;

public class CommonElementInSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int o = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] arr3 = new int[o];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < o; i++) {
            arr3[i] = scanner.nextInt();
        }
        for (int i = 0, j = 0, k = 0; i < n && j < m && k < o; ) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
