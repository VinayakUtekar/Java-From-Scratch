package JavaWithDSA.Searching;

import java.util.*;

public class NbyKFrequencyElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr1) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        int threshold = n / k;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > threshold) {
                System.out.println(entry.getKey());
            }
        }
    }
}
