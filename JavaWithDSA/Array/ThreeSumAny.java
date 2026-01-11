package JavaWithDSA.Array;

import java.util.*;

public class ThreeSumAny {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println("Found");
                        break;
                    }
                }
            }
        }
    }
}