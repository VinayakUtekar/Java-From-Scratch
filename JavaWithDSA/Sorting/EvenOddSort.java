package JavaWithDSA.Sorting;

import java.util.*;

public class EvenOddSort {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n-1;i++){
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
        System.out.println("Even : " + eve);
        System.out.println("Odd : " + odd);
    }
}
