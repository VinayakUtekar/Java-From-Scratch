package JavaWithDSA.Searching;

import java.util.*;

public class KthSmallestELementIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        int k = sc.nextInt();
        System.out.println(list.get(k - 1));
    }
}
