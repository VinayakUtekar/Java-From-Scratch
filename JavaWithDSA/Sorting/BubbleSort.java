package JavaWithDSA.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
