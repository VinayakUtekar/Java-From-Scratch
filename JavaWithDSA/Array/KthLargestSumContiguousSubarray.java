package JavaWithDSA.Array;

import java.util.*;

public class KthLargestSumContiguousSubarray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum = sum + a[j];
                list.add(sum);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        int k = sc.nextInt();
        System.out.println(list.get(k-1));
    }
}
