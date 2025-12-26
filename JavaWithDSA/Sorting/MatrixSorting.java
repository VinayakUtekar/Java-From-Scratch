package JavaWithDSA.Sorting;

import java.util.Scanner;

public class MatrixSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] a = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for(int j=0; j<n2; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n1; i++) {
            for(int j=0; j<n2; j++){
                for (int i2 = 0; i2 < n1; i2++) {
                    for(int j2=0; j2<n2; j2++){
                        if(a[i][j] < a[i2][j2]){
                            int t = a[i][j];
                            a[i][j] = a[i2][j2];
                            a[i2][j2] = t;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n1; i++) {
            for(int j=0; j<n2; j++){
                System.out.print(a[i][j]);
            }   
            System.out.println();
        }
    }
}
