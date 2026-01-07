package JavaWithDSA.Sorting;

import java.util.*;

public class FourSumDistinct {
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
                for(int k=j+1; k<n; k++){
                    int l = t - (a[i] + a[j] + a[k]);
                    if(r.contains(l) && l != a[i] && l != a[j] && l != a[k]){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(a[i]);
                        temp.add(a[j]);
                        temp.add(a[k]);
                        temp.add(l);
                        Collections.sort(temp);
                        if(!list.contains(temp)){
                            list.add(temp);
                            System.out.println(a[i] + " " + a[j] + " " + a[k] + " " + l);
                        }
                    }
                }
            }
        }
    }
}
