package Practice;

public final class SubClass2 extends SuperClass {


    public SubClass2(){

    }
    public SubClass2(int num1, String str){
        super(num1, str);
    }

    @Override
    public String print() {
        return "자식" + ", " + this.getNum1() + ", " + this.getStr();
    }

    public void myPrint() {
        System.out.println("내가 둘째입니다.");
    }
}
