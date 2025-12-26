package JavaWithDSA.Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SortAccordingToBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : a) {
            map.put(x, Integer.bitCount(x));
        }
        Arrays.sort(a, (x, y) -> {
            int bitCompare = map.get(y) - map.get(x); 
            if (bitCompare == 0)
                return x - y; 
            return bitCompare;
        });
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}
