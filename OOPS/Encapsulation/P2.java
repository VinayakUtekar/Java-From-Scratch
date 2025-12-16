package OOPS.Encapsulation;

class Book{
    //variable (instence variable)(state)
    int id;
    String title, author;
    double price;

    //Method
    void setData( int i, String t, String a, double p){
        id = i;
        title = t; 
        author = a;
        price = p;
    }
    //Method
    void Display(){
        System.out.println(id + " " + title + " " +  author + " " + price );
    }
}

class P2{
    public static void main(String args[]){
        //object 1
        Book b1 = new Book();
        b1.setData(101 , "WINGS OF FIRE", "DR. APJ ABDUL KALAM", 2000);
        b1.Display();
    }
}   