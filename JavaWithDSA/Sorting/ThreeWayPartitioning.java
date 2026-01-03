package JavaWithDSA.Sorting;

import java.util.Scanner;

public class ThreeWayPartitioning {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int h = sc.nextInt();

        int s=0,e=n-1, i=0;

        while (i <= e) {
            if (a[i] < l) {
                int temp = a[i];
                a[i] = a[s];
                a[s] = temp;
                s++;
                i++;
            } else if (a[i] > h) {
                int temp = a[i];
                a[i] = a[e];
                a[e] = temp;
                e--;
            } else {
                i++;
            }
        }
        for(int j : a){
            System.out.print(j + " ");
        }
    }
}
