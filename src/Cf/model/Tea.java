package Cf.model;

public class Tea extends Drink {

    private String season;
    private boolean alcohol;


    public Tea() {
    }

    public Tea(String name, String origin, String size, int price) {
        super(name, origin, size, price);
    }

    public Tea(String name, String origin, String size, int price, String season, boolean alcohol) {
        super(name, origin, size, price);
        this.season = season;
        this.alcohol = alcohol;

    }

    @Override
    public String drinkToString() {
        return getName() + ", " + getOrigin() + ", " + getSize() + ", " + getPrice() + ", " + season + ", " +alcohol;
    }
}
