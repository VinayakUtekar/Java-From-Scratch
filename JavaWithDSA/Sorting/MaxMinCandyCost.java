package JavaWithDSA.Sorting;

import java.util.*;

public class MaxMinCandyCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Arrays.sort(prices);

        int minCost = 0, maxCost = 0;

        int buy = 0;
        int free = n - 1;

        while (buy <= free) {
            minCost += prices[buy];
            buy++;
            free -= k;
        }

        buy = n - 1;
        free = 0;

        while (free <= buy) {
            maxCost += prices[buy];
            buy--;
            free += k;
        }

        System.out.println(minCost + " " + maxCost);
    }
}
