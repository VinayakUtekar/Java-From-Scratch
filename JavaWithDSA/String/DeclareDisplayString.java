package JavaWithDSA.String;

public class DeclareDisplayString {
    public static void main(String args[]){
        //signle line string
        String s1 = "Java Programming Language";

        //display 1
        System.out.println(s1);

        //display 2
        //more used fav.
        for(int i = 0; i< s1.length(); i++){
            char ch = s1.charAt(i);
            System.out.print(ch);
        }

        //display 3
        char ch[] = s1.toCharArray();
        for(char c : ch){
        System.out.print(c);
        }
        System.out.println();

    }
}
