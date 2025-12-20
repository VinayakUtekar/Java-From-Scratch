package JavaWithDSA.Array;

import java.util.Scanner;

public class Euilibrium {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length;i++){
            int leftSum = 0;
            for(int j=0; j<i; j++){
                leftSum += arr[j];
            }
            int rightSum = 0;
            for(int k=i+1; k<arr.length; k++){
                rightSum += arr[k];
            }
            if(leftSum == rightSum){
                System.out.println("Equilibrium index found at: " + i);
                return;
            }
        }
    }
}
