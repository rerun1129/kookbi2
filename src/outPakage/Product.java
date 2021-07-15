package outPakage;

public class Product extends MyProduct {

    public static void main(String[] args) {
        Product a = new Product();
        a.test();
        a.testMethod();
    }

    public void test(){
        System.out.println("미완성을 완성하였다.");
    }



}
