package Test0716.test4;


public abstract class Plane {

    private String planeName;
    private int fuelSize;

    public Plane() {
    }

    public Plane(String planeName, int fuelSize) {
        this.planeName = planeName;
        this.fuelSize = fuelSize;
    }

    public void refuel(int fuel){       //주유
        fuelSize += fuel;
        System.out.println(fuel + " 주유");
    }

    public abstract void flight(int distance);

    public String getPlaneName() {
        return planeName;
    }

    public int getFuelSize() {
        return fuelSize;
    }

    public void setFuelSize(int fuelSize) {
        this.fuelSize = fuelSize;
    }
}
