package JavaWithDSA.Array;

import java.io.Console;
import java.util.Arrays;

public class AlphaSorting {
    public static void main(String args[]) {
        Console c = System.console();

        int n = Integer.parseInt(c.readLine("Enter Array Size :"));
        String data[] = new String[n];

        for(int i=0; i<n ; i++)
            data[i] = c.readLine("Enter elements : ");

        Arrays.sort(data);

        for(String d : data)
            System.out.print(d);
    }
}
