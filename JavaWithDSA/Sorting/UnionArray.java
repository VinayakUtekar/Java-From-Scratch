package JavaWithDSA.Sorting;

import java.util.*;

public class UnionArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for (int k2 = 0; k2 < n2; k2++) {
            a2[k2] = sc.nextInt();
        }
        TreeSet<Integer> s = new TreeSet<>();
        for(int i: a){
            s.add(i);
        }
        for(int i: a2){
            s.add(i);
        }

        for(int i : s){
            System.out.print(i + " ");
        }
    }
}
