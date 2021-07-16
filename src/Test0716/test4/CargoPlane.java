package Test0716.test4;

public class CargoPlane extends Plane {

    public CargoPlane() {
    }

    public CargoPlane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) {
        int consume = distance*5;
        setFuelSize(getFuelSize()-consume);
    }
}
