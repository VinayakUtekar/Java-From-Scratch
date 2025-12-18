package JavaWithDSA.String;

public class StringOperations {
    public static void main(String args[]){
        String s1 = "Java";
        String s2 = "Programming";
        System.out.println(s1);
        System.out.println(s2);


        String s3 = s1 + s2;
        System.out.println(s3);


        s3 += "Builds";
        System.out.println(s3);

        String s4 = "Java";
        System.out.println(s1 == s4);
        String s5 = "java";
        System.out.println(s1 == s5);

        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}