package JavaWithDSA.Sorting;

import java.util.*;

public class MergeKSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[][] = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                mergedList.add(a[i][j]);
            }
        }
        Collections.sort(mergedList);
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
}
