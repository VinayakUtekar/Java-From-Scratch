package JavaWithDSA.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2; i>=0;i--){
            if(arr[i] >= max){
                leaders.add(arr[i]);
                max = arr[i];
            } 
        }
        for(int i=leaders.size()-1; i>=0; i--){
            System.out.print(leaders.get(i) + " ");
        }
    }
}
