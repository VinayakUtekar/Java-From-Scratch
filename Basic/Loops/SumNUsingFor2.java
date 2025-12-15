package Basic.Loops;

public class SumNUsingFor2 {
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);
        if(num > 0){
            int  i = 1 ,sum = 0;
            for( ; i <= num ; ){ 
                sum = sum + i;
                i = i + 1;
            }
            System.out.println("\n Sum IS : " + sum);
        }
        else{
            System.out.println("\n INVALID INPUT ");
        }
    }
}
