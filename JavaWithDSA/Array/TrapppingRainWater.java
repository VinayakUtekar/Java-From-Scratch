package JavaWithDSA.Array;

import java.util.*;

public class TrapppingRainWater {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int l = arr[0];
        int r = arr[n-1];
        int left = 0;
        int right = n-1;
        int water = 0;
        while(left <= right){
            if(l < r){
                if(arr[left] >= l){
                    l = arr[left];
                } else {
                    water += l - arr[left];
                }
                left++;
            } else {
                if(arr[right] >= r){
                    r = arr[right];
                } else {
                    water += r - arr[right];
                }
                right--;
            }
        }   
        System.out.println(water);
    }
}
