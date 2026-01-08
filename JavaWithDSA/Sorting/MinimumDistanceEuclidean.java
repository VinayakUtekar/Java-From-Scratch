package JavaWithDSA.Sorting;

import java.util.*;

public class MinimumDistanceEuclidean {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][2];
        for(int i=0; i<n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        double min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                double dist = Math.sqrt((a[i][0]-a[j][0])*(a[i][0]-a[j][0]) + (a[i][1]-a[j][1])*(a[i][1]-a[j][1]));
                if(dist < min){
                    min = dist;
                }
            }
        }
        System.out.printf("%.6f", min);
    }
}