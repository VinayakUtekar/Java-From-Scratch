package Basic.Operators;

public class PrePostIncrement {
    public static void main(String[] args) {
        int a=5, b=15;
        System.out.println(a + " " +b);
        System.out.println(++a);
        System.out.println(b++);
        System.out.println(++a +  ++b);
        System.out.println(a++ +  b++);
        System.out.println(++a + b++);
        System.out.println(a++ + ++b);
    }
}
