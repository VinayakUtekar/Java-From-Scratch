package JavaWithDSA.Array;

import java.util.Scanner;

public class ProductArrayExceptSelf {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int [] sum = new int[n];
        for(int i=0; i<n; i++){
            int product = 1;
            for(int j=0; j<n; j++){
                if(i != j){
                    product = product * a[j];
                }
            }
            sum[i] = product;
        }
        for(int i=0; i<n; i++){
            System.out.print(sum[i] + " ");
        }
    }
}
