package JavaAPI.throwTest;

public class exception extends Throwable {

    public void method_A() throws exception {
        System.out.println("메소드 A 입니다.");

        method_B();

        System.out.println("메소드 A종료.");
    }

    public void method_B() throws exception {
        System.out.println("메소드 B 입니다.");

        method_C();

        System.out.println("메소드 B종료.");
    }

    public void method_C() throws exception {
        System.out.println("메소드 C 입니다");

        throw new exception();

        //System.out.println("메소드 C 종료합니다.");
    }

}
