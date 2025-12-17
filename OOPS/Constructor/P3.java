package OOPS.Constructor;

class Fruit{
    private String Name;
    private String Colour;

    public Fruit(String Name,String Colour){
    this.Name = Name;
    this.Colour = Colour;
    }

    public void showData(){
        System.out.println("Name of fruit :  " + Name + " " + "     Colour of fruit : " + Colour);
    }
} 
class P3{
    public static void main(String args[]){
        Fruit f1 = new Fruit("Orange", "Orange");
        f1.showData();

        Fruit f2 = new Fruit("Apple", "Red");
        f2.showData();

        Fruit f3 = new Fruit("Banana", "Yellow");
        f3.showData();
    }
}