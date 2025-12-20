package JavaWithDSA.Array;

import java.util.*;

public class MaxSubArraySum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<ArrayList<Integer>, Integer> subArraySums = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            ArrayList<Integer> currentSubArray = new ArrayList<>();
            currentSubArray.add(arr[i]);
            int currentSum = arr[i];
            subArraySums.put(currentSubArray, currentSum);
            for(int j=i+1; j<arr.length; j++){
                currentSubArray.add(arr[j]);
                currentSum += arr[j];
                subArraySums.put(new ArrayList<>(currentSubArray), currentSum);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        ArrayList<Integer> maxSubArray = new ArrayList<>();
        for(Map.Entry<ArrayList<Integer>, Integer> entry : subArraySums.entrySet()){
            if(entry.getValue() > maxSum){
                maxSum = entry.getValue();
                maxSubArray = entry.getKey();
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Subarray with Maximum Sum: " + maxSubArray);
    }   
}
