package Practice;

public class Main {

    public static void main(String[] args) {

        SubClass1 sc1 = new SubClass1(1, "홍길동");
        SubClass2 sc2 = new SubClass2(2, "김명수");
        SubClass3 sc3 = new SubClass3();

        System.out.println(sc3.print());
        sc3.myPrint();


    }
}
