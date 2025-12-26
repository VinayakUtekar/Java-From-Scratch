package JavaWithDSA.Sorting;

import java.util.HashSet;
import java.util.Scanner;

public class KElementAfterRemovingSet {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt(), j=0;
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        int count = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!set.contains(i)) {
                count++;
                if (count == k) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
