package JavaWithDSA.Sorting;

import java.util.Scanner;

public class TwoIntervalintersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[][] a = new int[n1][2];

        for (int i = 0; i < n1; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        boolean res = false;

        for(int i=0; i<n1; i++){
            for(int j=i+1; j<n1; j++){
                int b = a[i][0];
                int c = a[i][1];
                int d = a[j][0];
                int e = a[j][1];
                if(d<=c && b<=e) {
                    res = true;
                    break;
                }
            }
        }

        System.out.println(res);
    }
}
