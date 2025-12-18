package JavaWithDSA.Array;

import java.io.*;
import java.util.*;

public class SortUsingFunction {
    public static void main(String args[]) {
        Console c = System.console();

        int n = Integer.parseInt(c.readLine("Enter Array Size :"));
        int data[] = new int[n];

        for(int i=0; i<n ; i++)
            data[i] = Integer.parseInt(c.readLine("Enter elements : "));

        Arrays.sort(data);

        for(int d : data)
            System.out.print(d);
    }
}