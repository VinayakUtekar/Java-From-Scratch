package JavaWithDSA.Array;

import java.util.Scanner;

public class ZeroToEnd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                System.out.print(arr[i] + " ");
            }else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(0 + " ");
        }
    }
}
