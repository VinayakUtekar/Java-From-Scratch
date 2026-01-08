package JavaWithDSA.Array;

import java.util.*;

public class RearrangeByReplaceUsingMissingWithNeg1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            if (a[i] >= 0 && a[i] < n) {
                res[a[i]] = a[i];
            }
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
