package JavaWithDSA.Sorting;

import java.util.Scanner;

public class PermutationPairSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int [] b = new int[n];
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean res = true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i] + b[j] < k){
                    res = false;
                }
            }
        }
        System.out.println(res);
    }
}
