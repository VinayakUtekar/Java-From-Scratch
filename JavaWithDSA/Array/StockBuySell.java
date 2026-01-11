package JavaWithDSA.Array;

import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] price = new int[n];

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (n == 0 || k == 0) {
            System.out.println("Maximum Profit: 0");
            return;
        }
        int[][] dp = new int[k + 1][n];
        for (int t = 1; t <= k; t++) {
            int minPrice = price[0];
            for (int i = 1; i < n; i++) {
                minPrice = Math.min(minPrice, price[i] - dp[t - 1][i - 1]);
                dp[t][i] = Math.max(dp[t][i - 1], price[i] - minPrice);
            }
        }

        System.out.println("Maximum Profit: " + dp[k][n - 1]);
    }
}