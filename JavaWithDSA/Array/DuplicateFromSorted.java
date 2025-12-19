package JavaWithDSA.Array;

import java.util.Scanner;

public class DuplicateFromSorted {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n-1];
        for(int i=0; i<n; i++){
            if(i==0){
                arr[i] = sc.nextInt();
                res[i] = arr[i];
            }
            else{
                arr[i] = sc.nextInt();
                if(arr[i] != arr[i-1]){
                    res[i] = arr[i];
                }
            }
        }
        for(int i: res){
            System.out.print(i + " ");
        }
    }
}
