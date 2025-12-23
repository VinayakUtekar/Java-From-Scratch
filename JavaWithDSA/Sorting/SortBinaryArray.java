package JavaWithDSA.Sorting;

import java.util.Scanner;

public class SortBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int[] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int z = 0;
        for (int i : a) {
            if (i == 0) {
                z++;
            } else {
                System.out.print(i + " ");
            }
        }
        for(int i=0; i<z; i++){
            System.out.print(0 + " ");
        }
    }
}
