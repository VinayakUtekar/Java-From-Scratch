package JavaWithDSA.Sorting;

import java.util.Scanner;

public class Sort1toN {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=1; i<=n; i++){
            if(a[i] !=i){
                a[i] = i;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
