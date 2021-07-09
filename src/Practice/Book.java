package Practice;

public class Book {

    private String title;
    private String author;
    private int price;
    private String publisher;

    public Book(String title, String author, int price, String publisher){
        this(title,author);
        this.price = price;
        this.publisher = publisher;

    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void printBook(){
        System.out.println(title +", "+ author +", "+ price +", "+ publisher);
    }
}
