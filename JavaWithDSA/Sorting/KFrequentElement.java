package JavaWithDSA.Sorting;

import java.util.*;

public class KFrequentElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i<n; i++){
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer> e : freqMap.entrySet()){
            if(e.getValue() >= k){
                System.out.print(e.getKey() + " ");
            }
        }
    }
}
