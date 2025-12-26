package JavaWithDSA.Sorting;

import java.util.*;

public class LinkedListSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> a = new LinkedList<>();
        for(int i=0; i<n; i++){
            a.add(sc.nextInt());
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a.get(i) < a.get(j)){
                    int t = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,t);
                }
            }
        }
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
