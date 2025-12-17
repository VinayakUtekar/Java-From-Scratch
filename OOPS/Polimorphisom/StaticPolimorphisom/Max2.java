package OOPS.Polimorphisom.StaticPolimorphisom;

class Find{
    void max(int n1, int n2){
        int res = 0;
        if(n1>n2)  
            res = n1;
        else  
            res = n2;
        System.out.println("Max = " + res);
    }

    void max(int n1, int n2, int n3){
        int res = 0;
        if(n1>n2)  
            res = n1;
        else  
            res = n2;
        if (n3>res) 
            res = n3;
        System.out.println("Max = " + res);
    }
}

class Max2{
    public static void main(String args[]){
        Find f = new Find();
        f.max(10,20,30);
        f.max(13,5);
    }
}