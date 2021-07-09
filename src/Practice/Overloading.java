package Practice;

public class Overloading {

    String str;
    int i;
    double d;
    String str2;

    public void isZero(String num) {
        if (num.equals("0")) {
            System.out.println("0 입니다.");
        } else {
            System.out.println("0이 아닙니다.");
        }
    }
    public void isZero(int num) {
        if (num == 0) {
            System.out.println("0 입니다.");
        } else {
            System.out.println("0이 아닙니다.");
        }
    }

    public void isZero(int num1, int num2) {
        if (num1 == 0 && num2 == 0) {
            System.out.println("0 입니다.");
        } else {
            System.out.println("0이 아닙니다.");
        }
    }
    public Overloading(String str, int i){
        this.str = str;
        this.i = i;

    }
    public Overloading(String str, int i, double d, String str2){
        this(str,i);
        this.d = d;
        this.str2 = str2;
    }
}