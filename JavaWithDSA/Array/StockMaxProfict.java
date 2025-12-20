package JavaWithDSA.Array;

import java.util.Scanner;

public class StockMaxProfict {
     public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int buy = arr[0];
        int sell = 0;;
        for(int i=1; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                buy = buy + arr[i+1];
                sell = sell + arr[i];

            }
        }
        sell = sell + arr[n-1];
        System.out.println("Profit : " + (sell - buy));
    }
}