package JavaWithDSA.String;

public class StringBufferMethod {
    public static void main(String [] args){
        String s1 = new String("Hello");
        System.out.println("Original String: " + s1);
        s1 = s1.concat(" World");
        System.out.println("After concat() method: " + s1);

        StringBuffer s = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + s);
        s.append(" world");
        System.out.println("After append() method: " + s);
    }
}
