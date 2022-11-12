package class26;

import java.util.LinkedList;

public class HW2 {
    /*Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
      Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
       Using for loop/advanced for loop/ iterator access all methods of the class. */
    public static void main(String[] args) {
        Card obj1=new Card("Visa");
        Card obj2 = new Card("Credit Card");
        Card obj3=new Card("Master Card");
        LinkedList <Card> cards= new LinkedList<>();
        cards.add(obj1);
        cards.add(obj2);
        cards.add(obj3);

        for(Card card:cards){

            card.TypeOfCredit();
        }

    }

}
class Card{
    String cardType;

    void TypeOfCredit() {
        System.out.println(cardType);
    }

    public Card(String cardType) {
        this.cardType = cardType;
    }
}
 class Card1 extends Card {

    public Card1(String cardType) {
        super(cardType);
    }
}
class card2 extends Card{

    public card2(String cardType) {
        super(cardType);
    }
}
class card3 extends Card{

    public card3(String cardType) {
        super(cardType);
    }
}
