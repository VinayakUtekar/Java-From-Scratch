package JavaWithDSA.Sorting;

import java.util.Scanner;

public class SortString {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        char []ch = a.toCharArray();
        for(int i=0; i<ch.length;i++){
            for(int j=i+1; j<ch.length;j++){
                if(ch[i] > ch[j]){
                    char c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c;
                }
            }
        }
        for(char c : ch){
            System.out.print(c + " ");
        }
    }
}
