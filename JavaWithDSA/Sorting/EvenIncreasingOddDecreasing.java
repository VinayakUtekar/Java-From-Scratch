package JavaWithDSA.Sorting;

import java.util.*;

public class EvenIncreasingOddDecreasing {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> eve = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i: a){
            if(i%2==0){
                eve.add(i);
            }
            else{
                odd.add(i);
            }
        }
        Collections.sort(eve);
        Collections.sort(odd);
        for(int i : eve){
            System.out.print(i + " ");
        }
        for(int i=odd.size()-1; i>=0; i--){
            System.out.print(i + " ");
        }
    }
}
