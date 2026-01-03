package JavaWithDSA.Sorting;

import java.util.Scanner;

public class ThreeSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(a[i]+a[j]+a[k] == t){
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }
}
