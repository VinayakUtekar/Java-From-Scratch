package JavaWithDSA.Array;

import java.util.Scanner;

public class RotateOneByOne {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        for(int j=0;j<d;j++){
            int last = arr[arr.length-1];
            int start = arr[0];
            for(int i=arr.length-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
