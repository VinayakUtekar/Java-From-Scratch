package Basic.InputOutput;

import java.io.*;

public class StreamReader {
    public static void main(String [] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(isr);  
        System.out.print("Enter Name : "); 
        String name = br.readLine();
        System.out.println("Name is : " + name); 
    }
}