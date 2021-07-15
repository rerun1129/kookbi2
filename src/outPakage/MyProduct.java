package outPakage;

import java.io.Serializable;

public abstract class MyProduct implements IProduct, Serializable {

    public MyProduct() {
    }
    public void print(){
        System.out.println("제품 정보 입니다...");
    }

    public abstract void test();

    public void testMethod(){
        System.out.println("인터페이스에서 온 메소드.");
    }

}
