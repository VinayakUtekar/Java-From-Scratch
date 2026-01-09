package JavaWithDSA.Array;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSpanSameSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += a1[i] - a2[i];
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(maxLen);
    }
}
