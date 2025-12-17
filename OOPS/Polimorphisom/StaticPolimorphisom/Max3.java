package OOPS.Polimorphisom.StaticPolimorphisom;.

class Find{
    void max(int ...data){
        int res = data[0];
        for(int d : data )
            if(d>res)
                res=d;
        System.out.println("Max = " + res);
    }
}

class Max3{
    public static void main(String args[]){
        Find f = new Find();
        f.max(10,20,30);
        f.max(13,5);
        f.max(13,5,5,9,7,6,8,3,4,2);
    }
}