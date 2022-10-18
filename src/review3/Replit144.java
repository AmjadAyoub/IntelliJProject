package review3;

public class Replit144 {

    public static void main(String[] args) {
        StoreProduct store= new StoreProduct("Eggs",3,"Produce",true,10);
        store.display();
        StoreProduct store1= new StoreProduct("Paper Towels",2.0,24);
        store1.display();
        StoreProduct store2= new StoreProduct("Paper Towels",2.0);
        store2.display();



    }

}

class StoreProduct{
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;
    StoreProduct(String label, double price, String category, boolean hasExpiration, int stock){
        this.label=label;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String label, double price, int stock){
        this.label=label;
        this.price=price;
        this.stock=stock;

    }
    StoreProduct(String label, double price){
        this.label=label;
        this.price=price;

    }
    public void display(){
        System.out.println(label +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
    }
}


