package JavaWithDSA.Sorting;

import java.util.*;

public class PosNegSort {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n-1;i++){
            a[i] = sc.nextInt();
        }
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        for(int i: a){
            if(i<0){
                neg.add(i);
            }
            else{
                pos.add(i);
            }
        }
        System.out.println("Negative : " + neg);
        System.out.println("Positive : " + pos);
    }
}
