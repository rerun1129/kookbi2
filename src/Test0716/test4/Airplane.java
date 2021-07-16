package Test0716.test4;

import java.util.Scanner;

public class Airplane extends Plane {

    public Airplane() {
    }

    public Airplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) {

        int consume = distance*3;
        setFuelSize(getFuelSize()-consume);
    }
}
