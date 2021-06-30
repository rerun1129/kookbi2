public class Variable2 {

    int num1 = 100;
    int num2 = 200;
    final int NUM3 = 300;



    public void method1(){

        int num2 = 150;
        int num4 = 250;

        System.out.println("전역 변수 :" + num1);
        System.out.println("지역 변수 :" + num2);
        System.out.println("상수 :" + NUM3);

    }
    public void method2(){

        num1 = 123;
        System.out.println("변경 확인 :" + num1);
        //num3 = 456;

    }
    public void method4(int hw){
        int lh= 9;
        System.out.println("일당 :" + lh*hw);
    }
}
