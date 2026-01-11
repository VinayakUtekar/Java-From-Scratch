package JavaWithDSA.Array;

import java.util.*;

public class FourSumClosest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int [] res = new int[4];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    for(int l=k+1; l<arr.length; l++){
                        int sum = arr[i] + arr[j] + arr[k] + arr[l];
                        if(Math.abs(sum - target) < min){
                            min = Math.abs(sum - target);
                            res[0] = arr[i];
                            res[1] = arr[j];
                            res[2] = arr[k];
                            res[3] = arr[l];
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(res));
    }
}