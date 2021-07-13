package Practice;

public class SubClass1 extends SuperClass {

    public SubClass1() {

    }

    public SubClass1(int num1, String str) {
        super(num1, str);
    }

    @Override
    public String print() {
        return "자식" + ", " + this.getNum1() + ", " + this.getStr();
    }

    public final void myPrint() {
        System.out.println("내가 첫째입니다.");
    }

}
