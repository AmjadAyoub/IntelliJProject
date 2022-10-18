package review3;

public class Replit148 {
    public static void main(String[] args) {
        ShoppingStore store= new ShoppingStore("Blanket",24.995,4);
        store.itemTotalPrice();
        ShoppingStore store1= new ShoppingStore("Mattress",219.59,2);
        store1.itemTotalPrice();
        double sum = store.total + store1.total;
        System.out.println("You purchased "+sum+ " Today");
    }



}
class ShoppingStore {

    double total;
    String item;
    double price;
    int quantity;

    public ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }
    void itemTotalPrice() {
        total=price*quantity;
        System.out.println(item+" "+"Total Value "+total);

    }
}
