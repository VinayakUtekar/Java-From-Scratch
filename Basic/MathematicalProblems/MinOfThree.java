package Basic.MathematicalProblems;

public class MinOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        int min = a < b ? a : b;
        min = min < c ? min : c;
        System.out.println("The minimum of the three numbers is: " + min);
    }
}
