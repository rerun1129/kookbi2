package Practice;

public class Run1 {
    public static void main(String[] args) {
        Variable2 p = new Variable2();
        p.method1();
        p.method2();
        p.method4(9000);
        int a = 12;
        double d = 3.3;
        double result = a+d;
        int f = (int) result;
        System.out.println(f);
        char ch = '긁';
        int b = 5;
        int c = '긁';
        System.out.println(c);
        int num2 = 300;
        char ch3 = (char) num2;
        System.out.println(ch3);
        int num1 = 100;
        long num3 = 500l;
        double result1 = num1 + num3;
        System.out.println(result1);
    }
}
