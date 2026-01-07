package JavaWithDSA.Sorting;

import java.util.*;

public class ThreeSumDistinct {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        HashSet<Integer> r = new HashSet<>();
        for(int i : a){
            r.add(i);
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int k = t - (a[i] + a[j]);
                if(r.contains(k) && k != a[i] && k != a[j]){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(a[i]);
                    temp.add(a[j]);
                    temp.add(k);
                    Collections.sort(temp);
                    if(!list.contains(temp)){
                        list.add(temp);
                        System.out.println(a[i] + " " + a[j] + " " + k);
                    }
                }
            }
        }
    }
}
