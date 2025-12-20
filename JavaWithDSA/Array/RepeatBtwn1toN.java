package JavaWithDSA.Array;

import java.util.Scanner;
import java.util.ArrayList;

public class RepeatBtwn1toN {
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int l = arr.length-1, sum=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(list.contains(i)){
                System.out.print(i + " ");
            } 
            else {
                list.add(i);
            }
        }
    }
}
