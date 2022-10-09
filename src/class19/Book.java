package class19;

public class Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    int numberOfPages;
    String color;
    String quality;
    String topic;

    public Book(int numberOfPages, String color, String quality, String topic) {
    //    this.numberOfPages = numberOfPages;
     //  this.color = color;
     //  this.quality = quality;
      //  this.topic = topic;
        this(numberOfPages,color,quality);
       // this.topic=topic;
        System.out.println(numberOfPages+" "+color+" "+quality+" "+topic);
    }

    public Book(int numberOfPages, String color, String quality) {
     this.numberOfPages = numberOfPages;
      this.color = color;
      this.quality = quality;
     //  this(numberOfPages,color,quality); // we cannot use it here
        System.out.println(numberOfPages+" "+color+" "+quality);
    }



    public static void main(String[] args) {
        new Book(500,"blue","very good", "medical");
        new Book(300,"black","good", "political");
    }
}
