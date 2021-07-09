package Convenience.model.vo;

public class Cvs {
    private String name;
    private int price;
    private int stock;
    private String origin;

    public Cvs() {                                                          //공백 생성자
    }

    public Cvs(String name, int price, int stock, String origin) {          //매개 생성자
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.origin = origin;
    }

    public String getName() {                                               //getter setter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }


    public String productToString() {
        return name + ", " + price + ", " + stock + ", " + origin;
    }
}
