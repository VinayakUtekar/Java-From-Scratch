package JavaWithDSA.Sorting;

import java.util.*;

public class SmallestSubarraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]= new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int t [] = a.clone();
        Arrays.sort(t);
        int start = -1;
        int end = -1;
        for (int i = 0; i < n; i++) {
            if(a[i] != t[i]){
                start = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if(a[i] != t[i]){
                end = i;
                break;
            }
        }
        System.out.println(start + " " + end);
    }
}
