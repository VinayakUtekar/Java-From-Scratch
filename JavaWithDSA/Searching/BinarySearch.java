package JavaWithDSA.Searching.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int s=0,e=arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==t){
                System.out.println("Target at position : "  + m);
                break;
            }
            else if(arr[m]<t){
                s=m+1;
            }
            else{
                e = m-1;
            }
        }
    }
}
