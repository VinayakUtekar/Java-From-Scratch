package JavaWithDSA.Sorting;

import java.util.*;

public class MinimumSwapToSortArray2Position {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int swapCount = 0;
        boolean result = true;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    swapCount++;
                }
                if(swapCount > 2){
                    result = false;
                    System.out.println("More than 2 swaps needed");
                    break;
                }
            }
        }
    }
}
