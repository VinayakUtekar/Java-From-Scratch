package JavaWithDSA.Sorting;

import java.util.*;

public class MergeTwoArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] b = new int[n2];
        for(int i=0; i<n2; i++){
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> merged = new ArrayList<>();
        for(int i=0; i<n; i++){
            merged.add(a[i]);
        }
        for(int i=0; i<n2; i++){
            merged.add(b[i]);
        }
        Collections.sort(merged);
        int k = 0;
        for(int i=0; i<n; i++){
            a[i] = merged.get(k);
            k++;
        }
        for(int i=0; i<n2; i++){
            b[i] = merged.get(k);
            k++;
        }
        System.out.println("First Array After Merging: ");
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Second Array After Merging: ");
        for(int i=0; i<n2; i++){
            System.out.print(b[i] + " ");
        }
    }
}
