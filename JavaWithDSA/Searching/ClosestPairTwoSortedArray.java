package JavaWithDSA.Searching;

import java.util.*;

public class ClosestPairTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int [] a = new int[2];
        int k = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n2; j++){
                int t = arr1[i] + arr2[j];
                if(Math.abs(k - t) < min){
                    min = Math.abs(k - t);
                    a[0] = arr1[i];
                    a[1] = arr2[j];
                }
            }
        }
        System.out.println(a[0] + " " + a[1]);
    }
}