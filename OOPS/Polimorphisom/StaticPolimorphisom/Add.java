package OOPS.Polimorphisom.StaticPolimorphisom;

class Compute{
    public void Add(int n1,int n2){
        int res = n1 + n2;
        System.out.println("Result =" + res);	
    }

    public void Add(int n1,int n2,int n3){
        int res = n1 + n2 + n3;
        System.out.println("Result =" + res);	
    }
} 

class Add{
    public static void main(String args[]){
        Compute c = new Compute();
        c.Add(10,20);
        c.Add(10,20,30);
    }
}