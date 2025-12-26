package JavaWithDSA.Sorting;

import java.util.*;

public class SortArrayTwoHalvesSorted {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
