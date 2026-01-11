package JavaWithDSA.Array;

import java.util.*;

public class FourSumDistinct {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    for(int l=k+1; l<arr.length; l++){
                        if(arr[i] + arr[j] + arr[k] + arr[l] == target){
                            ArrayList<Integer> quad = new ArrayList<>();
                            quad.add(arr[i]);
                            quad.add(arr[j]);
                            quad.add(arr[k]);
                            quad.add(arr[l]);
                            Collections.sort(quad);
                            if(!result.contains(quad)){
                                result.add(quad);
                            }
                        }
                    }
                }
            }
        }
        for(ArrayList<Integer> quad : result){
            System.out.println(quad);
        }
    }
}