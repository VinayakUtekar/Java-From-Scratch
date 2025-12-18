package JavaWithDSA.String;

import java.io.Console;

public class UsernamePassword {
    public static void main(String args[]){
        Console c = System.console();
        String username = new String(c.readLine(" Enter User name : "));
        String password = new String(c.readLine(" Enter Password : "));

        if((username.equals("Java")) && (password.equals("Future"))){
            System.out.println(" Success");
        }
        else{
            System.out.println(" Failure");
        }
    }
}