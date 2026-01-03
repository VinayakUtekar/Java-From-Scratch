package JavaWithDSA.Sorting;

import java.util.Scanner;

public class ThreeSumClosest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int []m = new int[3];

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = a[i]+a[j]+a[k];
                    if(min > Math.abs(sum-t)){
                        m[0] = a[i];
                        m[1] = a[j];
                        m[2] = a[k];
                    }
                }
            }
        }
        System.out.println(m[0] + " "  + m[1] + " " + m[2]);
    }
}
