package JavaWithDSA.Sorting;

import java.util.Scanner;

public class WaveFormSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();   
        }
        for (int i = 0; i < n; i++) {
            if(i%2!=0){
                int t = a[i];
                a[i] = a[i+1];
                a[i+1] = t;
            }   
        }
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
