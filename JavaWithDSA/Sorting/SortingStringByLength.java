package JavaWithDSA.Sorting;

import java.util.*;

public class SortingStringByLength {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        TreeMap<Integer, List<String>> mp = new TreeMap<>();
        for (String s : a) {
            int len = s.length();
            mp.putIfAbsent(len, new ArrayList<>());
            mp.get(len).add(s);
        }
        for (Map.Entry<Integer, List<String>> entry : mp.entrySet()) {
            for (String s : entry.getValue()) {
                System.out.print(s + " ");
            }
        }
        
    }
}
