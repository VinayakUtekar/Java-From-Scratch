package Basic.Loops;

public class FactorialFor {
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);
        if(num >= 0){
            double  fact = 1;
            for( int i = 1 ; i <= num ; i++ ){ 
                fact = fact + i;
            }
            System.out.println("\n FACTORIAL OF " + num +" IS : " + fact);
        }
        else{
            System.out.println("\n INVALID INPUT ");
        }
    }
}
