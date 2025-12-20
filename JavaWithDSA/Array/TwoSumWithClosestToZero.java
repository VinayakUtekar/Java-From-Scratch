package JavaWithDSA.Array;

import java.util.*;

public class TwoSumWithClosestToZero {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                int sum = arr[i] + arr[j];
                map.put(pair, sum);
            }
        }
        int closestSum = Integer.MAX_VALUE;
        ArrayList<Integer> resultPair = new ArrayList<>();
        for(Map.Entry<ArrayList<Integer>, Integer> entry : map.entrySet()){
            int currentSum = entry.getValue();
            if(Math.abs(currentSum) < Math.abs(closestSum)){
                closestSum = currentSum;
                resultPair = entry.getKey();
            }
        }
        System.out.println("Pair with sum closest to zero: " + resultPair);
    }
}
