package Tele.model.vo;

public class TV extends Product {


    public TV() {
    }
    public TV(String modelName, int price) {
        super(modelName, price);
    }

    public void watch(){
        System.out.println("TV 시청중");
    }
}

