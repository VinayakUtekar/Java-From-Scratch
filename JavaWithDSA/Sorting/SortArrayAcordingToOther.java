package JavaWithDSA.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortArrayAcordingToOther {
    static void relativeSort(int[] a1, int[] a2) {
        int m = a1.length, n = a2.length;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < m; i++) {
            freq.put(a1[i], freq.getOrDefault(a1[i], 0) + 1);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            while (freq.getOrDefault(a2[i], 0) > 0) {
                a1[index++] = a2[i];
                freq.put(a2[i], freq.get(a2[i]) - 1);
            }
            freq.remove(a2[i]);
        }
        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                remaining.add(entry.getKey());
            }
        }
        Collections.sort(remaining);
        for (int num : remaining) {
            a1[index++] = num;
        }
    }
    public static void main(String[] args) {
        int[] a1 = {2, 1, 2, 3, 4};
        int[] a2 = {2, 1, 2};
        relativeSort(a1, a2);
        for (int num : a1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
    
