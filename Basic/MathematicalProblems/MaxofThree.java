package Basic.MathematicalProblems;

public class MaxofThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
