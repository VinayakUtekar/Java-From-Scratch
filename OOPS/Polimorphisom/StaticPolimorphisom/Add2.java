package OOPS.Polimorphisom.StaticPolimorphisom;

class Compute{
    public static void Add(int n1,int n2){
        int res = n1 + n2;
        System.out.println("Result =" + res);	

    }
    public static void Add(int n1,int n2,int n3){
        int res = n1 + n2 + n3;
        System.out.println("Result =" + res);	
    }
    public static void Add(int n1,int n2,int n3,int n4){
        int res = n1 + n2 + n3 + n4;
        System.out.println("Result =" + res);	

    }
} 
class ComputeTest3{
    public static void main(String args[]){
        Compute.Add(10,20);
        Compute.Add(10,20,30);
        Compute.Add(15,20);
        Compute.Add(10,20,30,40);
    }
}