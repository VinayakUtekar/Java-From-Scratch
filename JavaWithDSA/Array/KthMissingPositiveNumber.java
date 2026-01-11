package JavaWithDSA.Array;

import java.util.*;

public class KthMissingPositiveNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int missingCount = 0;
        int max = 0;
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for(int i=1; i<=max; i++){
            boolean found = false;
            for(int j=0; j<n; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                missingNumbers.add(i);
                missingCount++;
                if(missingCount == k){
                    System.out.println(i);
                    return;
                }
            }
        }
        if(missingCount < k){
            System.out.println(max + (k - missingCount));
        }
    }
}
