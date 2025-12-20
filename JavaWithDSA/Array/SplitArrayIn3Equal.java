package JavaWithDSA.Array;

import java.util.*;

public class SplitArrayIn3Equal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            ArrayList<Integer> subArray = new ArrayList<>();
            subArray.add(arr[i]);
            int sum = arr[i];
            map.put(subArray, sum);
            for(int j=i+1; j<arr.length; j++){
                subArray.add(arr[j]);
                sum += arr[j];
                map.put(subArray, sum);
            }
        }
        ArrayList<ArrayList<Integer>> resultSubArrays = new ArrayList<>();
        int targetSum = 0; ind ++;
        for(Map.Entry<ArrayList<Integer>, Integer> entry : map.entrySet()){
            targetSum = entry.getValue();
            for()
        }

        for(ArrayList<Integer> subArray : resultSubArrays){
            System.out.println(subArray);
        }
    }
}