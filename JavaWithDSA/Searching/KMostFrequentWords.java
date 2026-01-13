package JavaWithDSA.Searching;

import java.util.*;

public class KMostFrequentWords {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String [] a = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (int i = 0; i < k; i++) {
            String maxKey = "";
            int maxValue = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue() > maxValue) {
                    maxValue = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            System.out.println(maxKey + " " + maxValue);
            map.remove(maxKey);
        }
    }
}
