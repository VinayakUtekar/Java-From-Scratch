package JavaWithDSA.Sorting;

import java.util.*;

public class MakingArrayElementSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean res = false;
        int l = 0;
        Arrays.sort(a);
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(a[0]);
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) {
                unique.add(a[i]);
            }
        }

        boolean possible = false;

        if (unique.size() == 1) {
            possible = true;
        } 
        else if (unique.size() == 2) {
            possible = true;
        } 
        else if (unique.size() == 3) {
            int d1 = unique.get(1) - unique.get(0);
            int d2 = unique.get(2) - unique.get(1);
            if (d1 == d2) {
                possible = true;
            }
        }

        System.out.println(possible ? "YES" : "NO");
        sc.close();
    }
}
