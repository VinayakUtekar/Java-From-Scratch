package JavaWithDSA.Sorting;

import java.util.Scanner;

public class TwoSumSortedArrayForTarget {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }
        int t = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j=i+1; j<n; j++){
                int sum = a[i] + a[j];
                if(sum == t){
                    System.out.println(i + " " + j);
                }
            }   
        }
    }
}
