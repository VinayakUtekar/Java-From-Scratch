package JavaWithDSA.Array;

import java.util.Scanner;

public class MinimumIncrementForSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max=0;
        for(int i : arr){
            if(i>max){
                max = i;
            }
        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if((max - arr[i]) % k != 0){
                res = -1;
                break;
            }else{
                res += (max - arr[i]) / k;
            }
        }
        System.out.println(res);
    }
}
