package JavaWithDSA.Array;

import java.util.*;

public class TwoSumAllPair {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                ArrayList<Integer> pair = new ArrayList<>();
                if(arr[i] + arr[j] == target){
                    pair.add(i);
                    pair.add(j);
                    result.add(pair);
                }
            }
        }
        for(List<Integer> pair : result){
            System.out.println(pair);
        }
    }
}
