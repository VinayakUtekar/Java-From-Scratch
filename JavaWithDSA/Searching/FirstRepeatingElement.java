package JavaWithDSA.Searching;

import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            for (int j = i + 1; j < n2; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The first repeating element is: " + arr[i]);
                    break;
                }
            }
        }
    }
}
