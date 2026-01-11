package JavaWithDSA.Array;

import java.util.*;

public class StockBuySell2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int[][] dp = new int[2 + 1][n];
        for (int t = 1; t <= 2; t++) {
            int minPrice = price[0];
            for (int i = 1; i < n; i++) {
                minPrice = Math.min(minPrice, price[i] - dp[t - 1][i - 1]);
                dp[t][i] = Math.max(dp[t][i - 1], price[i] - minPrice);
            }
        }

        System.out.println("Maximum Profit: " + dp[2][n - 1]);
    }
}