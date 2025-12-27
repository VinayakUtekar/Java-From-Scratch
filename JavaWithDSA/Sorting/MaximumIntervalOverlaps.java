import java.util.Arrays;
import java.util.Scanner;

public class MaximumIntervalOverlaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] entry = new int[n];
        int [] exit = new int[n];

        for (int i = 0; i < n; i++) {
            entry[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            exit[i] = sc.nextInt();
        }

        Arrays.sort(entry);
        Arrays.sort(exit);

        int i = 0, j = 0;
        int currentGuests = 0;
        int maxGuests = 0;
        int timeOfMax = 0;

        while (i < n && j < n) {
            if (entry[i] <= exit[j]) {
                currentGuests++;

                if (currentGuests > maxGuests) {
                    maxGuests = currentGuests;
                    timeOfMax = entry[i];
                }
                i++;
            } else {
                currentGuests--;
                j++;
            }
        }

        System.out.println(maxGuests + " " + timeOfMax);
    }
}
