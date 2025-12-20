package JavaWithDSA.Array;

import java.util.Scanner;
import java.util.ArrayList;

public class SortedSequence {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int s=1, min=arr[0], max=Integer.MIN_VALUE,Store=min;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            else if(arr[i] < min){
                min = arr[i];
                continue;
            }
            else if(arr[i] < max){
                max = arr[i];
                Store = min;
            }
            else if(arr[i] > max){
                s++;
                if(s==3){
                    System.out.print(Store + " " + max + " " + min);
                    return;                   
                }
                max = arr[i];
            }
        }
    }
}
