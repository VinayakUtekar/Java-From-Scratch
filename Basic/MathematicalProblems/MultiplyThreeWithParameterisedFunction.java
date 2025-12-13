package Basic.MathematicalProblems;

public class MultiplyThreeWithParameterisedFunction {
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String args []) {
        int a = 2;
        int b = 3;
        int c = 4;
        int result = multiply(a,b,c);
        System.out.println("Multiplication: " + result);
    }
}
