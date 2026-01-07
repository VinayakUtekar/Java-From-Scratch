package JavaWithDSA.Sorting;

import java.util.Scanner;

public class FourSum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int [] res = new int[4];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    for(int m=l+1; m<n; m++){
                        if(a[i] + a[j] + a[l] + a[m] == k){
                            res[0] = a[i];
                            res[1] = a[j];
                            res[2] = a[l];
                            res[3] = a[m];
                        }
                    }
                }
            }
        }
        System.out.println(res[0] + " " + res[1] + " " + res[2] + " " + res[3]);
    }
}
