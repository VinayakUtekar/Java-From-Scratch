package JavaWithDSA.Sorting;

import java.util.*;

public class SortFromDifferentMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                result.add(sc.nextInt());
            }
        }
        Collections.sort(result);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
