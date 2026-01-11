package JavaWithDSA.Array;

import java.util.*;

public class MedianForRunningStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] res = new int[n];
        int count = 1;
        int sum =0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            res[i] = sum /count;
            count++;
        }
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}