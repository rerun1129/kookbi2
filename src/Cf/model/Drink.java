package Cf.model;

public abstract class Drink {

    private String name;
    private String origin;
    private String size;
    private int price;

    public Drink() {
    }

    public Drink(String name, String origin, String size, int price) {
        super();
        this.name = name;
        this.origin = origin;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String drinkToString() {
        return name + ", " + origin + ", " + size + ", " + price;
    }
}
