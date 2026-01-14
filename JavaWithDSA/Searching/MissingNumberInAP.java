package JavaWithDSA.Searching;

public class MissingNumberInAP {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 10, 12};
        int n = arr.length;
        int first = arr[0];
        int last = arr[n - 1];
        int d = (last - first) / n;
        for (int i = 0; i < n; i++) {
            int expectedValue = first + i * d;
            if (arr[i] != expectedValue) {
                System.out.println("Missing number in AP is: " + expectedValue);
                break;
            }
        }
    }
}
