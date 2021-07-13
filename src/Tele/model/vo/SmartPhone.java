package Tele.model.vo;

public class SmartPhone extends Product {



    public SmartPhone() {
    }

    public SmartPhone(String modelName, int price) {
        super(modelName, price);
    }

    public void playApp(){

        System.out.println("지듣노");

    }

}
