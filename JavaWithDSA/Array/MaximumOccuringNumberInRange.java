package JavaWithDSA.Array;

import java.util.*;

public class MaximumOccuringNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        for(int i: arr2){
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        int maxCount = 0;
        int result = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                result = entry.getKey();
            } else if(entry.getValue() == maxCount && entry.getKey() < result){
                result = entry.getKey();
            }
        }
        System.out.println(result);
    }
}
