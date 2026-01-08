package JavaWithDSA.Array;

import java.util.Scanner;

public class ReorderAccordingToIndex {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ind [] = new int[n];
        for(int i=0; i<n; i++){
            ind[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            while(ind[i] != i){
                int temp = a[i];
                a[i] = a[ind[i]];
                a[ind[i]] = temp;

                int t = ind[i];
                ind[i] = ind[t];
                ind[t] = t;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
