package JavaWithDSA.Array;

import java.util.*;

public class SmallestSubarrayWithGreatestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            sum += arr[end];
            while (sum > x) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        System.out.println(minLen == Integer.MAX_VALUE ? 0 : minLen);
    }
}