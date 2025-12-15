package Basic.Loops;

public class SumNUsingFor {
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);
        if(num > 0){
            int  sum = 0;
            for( int i = 1 ; i <= num ; i++ ){
                sum = sum + i;
            }
            System.out.println("\n Sum IS : " + sum);
        }
        else{
            System.out.println("\n INVALID INPUT ");
        }
    }
}
