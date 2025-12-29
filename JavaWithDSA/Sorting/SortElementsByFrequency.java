package JavaWithDSA.Sorting;

import java.util.*;

public class SortElementsByFrequency {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            if(mp.containsKey(a[i])){
                int c = mp.get(a[i]);
                mp.remove(a[i]);
                mp.put(a[i], c+1);
            }
            else{
                mp.put(a[i],1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> s = new ArrayList<>(mp.entrySet());
        for(int i=0; i< s.size(); i++){
            for(int j=i+1; j< s.size(); j++){
                if(s.get(i).getValue() < s.get(j).getValue()){
                    Map.Entry<Integer,Integer> t = s.get(i);
                    s.set(i,s.get(j));
                    s.set(j,t);
                }
            }
        }

        for (Map.Entry<Integer, Integer> e : s) {
            int element = e.getKey();
            int freq = e.getValue();

            for (int i = 0; i < freq; i++) {
                System.out.print(element + " ");
            }
        }
    }
}
