package Basic.InputOutput;

import java.io.*;

public class StreamReader {
    public static void main(String [] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int a = br.readline();
    }
}