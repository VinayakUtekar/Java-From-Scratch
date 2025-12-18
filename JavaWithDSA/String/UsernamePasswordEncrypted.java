package JavaWithDSA.String;

import java.io.Console;

public class UsernamePasswordEncrypted {
    public static void main(String args[]){
        Console c = System.console();
        String username = new String(c.readLine(" Enter User name : "));
        String password = new String(c.readPassword(" Enter Password : "));

        if((username.equals("Java")) && (password.equals("Future"))){
            System.out.println(" Success");
        }
        else{
            System.out.println(" Failure");
        }
    }
}