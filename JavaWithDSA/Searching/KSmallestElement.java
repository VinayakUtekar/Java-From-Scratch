package JavaWithDSA.Searching;

import java.util.*;

public class KSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Arrays.sort(arr);
        for (int i=0; i<n; i++) {
            if(k>0){
                System.out.print(arr[i] + " ");
                k--;
            }
        }
    }
}
