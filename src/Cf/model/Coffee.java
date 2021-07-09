package Cf.model;

public class Coffee extends Drink {

    private int syrup;
    private String temper;


    public Coffee() {
    }

    public Coffee(String name, String origin, String size, int price, int syrup, String temper) {
        super(name, origin, size, price);
        this.syrup = syrup;
        this.temper = temper;
    }

    @Override
    public String drinkToString() {
        return getName() + ", " + getOrigin() + ", " + getSize() + ", " + getPrice() + ", " + syrup + ", " +temper;
    }


}
