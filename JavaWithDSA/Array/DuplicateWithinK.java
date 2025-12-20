package JavaWithDSA.Array;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateWithinK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++)
        {
            if (set.contains(arr[i]))
               System.out.println("true");
            set.add(arr[i]);
            if (i >= k)
              set.remove(arr[i-k]);
        }
    }
}
