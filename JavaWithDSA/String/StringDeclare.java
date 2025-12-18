package JavaWithDSA.String;

public class StringDeclare {
    public static void main(String args[]){
    //signle line string
    String s1 = "Computer Coding";
    System.out.println(s1); 

    String s2 = new String("Software Development");
    System.out.println(s2);

    //Multi line String
    // text blocks java 16
    //in this after """ given input from nextline
    String s3 = """
    Computer Engineering Majorly Includes
    1. Software Development
    2. Web Development
    3. Mobile App Development
    4. Data Science""";
    System.out.println(s3);  

    }
}
