package JavaWithDSA.Searching;

import java.util.*;

public class ClosestKElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        int k = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            int a = arr[i] - x;
            if(a>0){
                result.add(a);
            } 
        }
        Collections.sort(result);
        for(int i=0; i<k; i++){
            System.out.print((result.get(i)+x) + " ");
        }
    }
}
