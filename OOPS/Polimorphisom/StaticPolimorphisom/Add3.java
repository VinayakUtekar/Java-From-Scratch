package OOPS.Polimorphisom.StaticPolimorphisom;

class Compute{
    public static void Add(int ...n){
        int res = 0;
        for(int d : n) 
            res = res + d;
        System.out.println("Result =" + res);


    }
} 
class Add3{
    public static void main(String args[]){
        Compute.Add(10,20,30,40,50,60,70,80,90);
        Compute.Add(10,20);
        Compute.Add(10,20,30);
        Compute.Add(15,20);
        Compute.Add(10,20,30,40);
    }
}