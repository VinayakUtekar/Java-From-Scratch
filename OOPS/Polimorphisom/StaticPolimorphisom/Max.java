package OOPS.Polimorphisom.StaticPolimorphisom;

class Find{
    void max(int n1, int n2){
        int res = 0;
        if(n1>n2)  
            res = n1;
        else  
            res = n2;
        System.out.print("Max = " + res);
    }
}

class Max{
    public static void main(String args[]){
        Find f = new Find();
        f.max(10,20);
    }
}