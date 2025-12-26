package JavaWithDSA.Sorting;

import java.util.*;

public class MergeSortedArrays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for (int l = 0; l < n2; l++) {
            a2[l] = sc.nextInt();
        }
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < n2) {
            if (a[i] <= a2[j]) {
                res.add(a[i]);
                i++;
            } else {
                res.add(a2[j]);
                j++;
            }
        }
        while (i < n) {
            res.add(a[i]);
            i++;
        }
        while (j < n2) {
            res.add(a2[j]);
            j++;
        }
        for(int m : res){
            System.out.print(m + " ");
        }
    }
}
