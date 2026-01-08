package JavaWithDSA.Array;

import java.util.Scanner;

public class SmallestNumberInRange {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for(int i=0; i<n; i++){
            if(a[i] != 1){
                System.out.println(i);
                break;
            }
        }
    }
}
