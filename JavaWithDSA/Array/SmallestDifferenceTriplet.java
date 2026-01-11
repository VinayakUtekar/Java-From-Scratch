package JavaWithDSA.Array;

import java.util.*;

public class SmallestDifferenceTriplet {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int a2[] = new int[n];
        for(int i=0; i<n; i++){
            a2[i] = sc.nextInt();
        }
        int a3[] = new int[n];
        for(int i=0; i<n; i++){
            a3[i] = sc.nextInt();
        }
        int [] res = new int[3];
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    int max = Math.max(a[i], Math.max(a2[j], a3[k]));
                    int min = Math.min(a[i], Math.min(a2[j], a3[k]));
                    if((max - min) < diff){
                        diff = max - min;
                        res[0] = a[i];
                        res[1] = a2[j];
                        res[2] = a3[k];
                    }
                }
            }
        }
        System.out.println("The triplet is: " + res[0] + " " + res[1] + " " + res[2]);
    }
}
