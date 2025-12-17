package OOPS.Constructor;

class Book{
    int id;
    String title;
    String Author;
    double price;

    Book(int id, String title, String Author, double price){
        this.id = id;
        this.title = title;
        this.Author = Author;
        this.price = price;
    }

    void showData(){
        System.out.println("Id = " + id + " Title = " + title + " Author = " + Author + " Price = " + price);	
    }
}

public class P1 {
    public static void main(String args []){
        Book b = new Book(101, "Java", "XYZ", 450.50);
        b.showData();
    }
}
