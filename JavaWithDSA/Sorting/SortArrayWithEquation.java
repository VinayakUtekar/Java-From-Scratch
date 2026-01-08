package JavaWithDSA.Sorting;

import java.util.Scanner;

public class SortArrayWithEquation {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] k = new int[n];
        for(int i=0; i<n; i++){
            k[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int i=0; i<n; i++){
            k[i] = a*k[i]*k[i] + b*k[i] + c;
        }
        for(int i : k){
            System.out.print(i + " ");
        }
    }
}
