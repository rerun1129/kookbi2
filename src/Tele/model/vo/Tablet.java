package Tele.model.vo;

public class Tablet extends Product{

    public Tablet() {
    }

    public Tablet(String modelName, int price) {
        super(modelName, price);
    }

    public void write(){
        System.out.println("그림 그리는 중");
    }

}
