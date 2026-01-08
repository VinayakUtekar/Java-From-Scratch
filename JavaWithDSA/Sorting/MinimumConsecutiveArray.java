package JavaWithDSA.Sorting;

import java.util.*;

public class MinimumConsecutiveArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int count = 1;
        Arrays.sort(a);
        for(int i=1; i<n; i++){
            if(a[i] == a[i-1] + 1){
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
