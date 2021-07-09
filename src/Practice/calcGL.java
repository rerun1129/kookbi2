package Practice;

import java.util.Scanner;

public class calcGL {
    Scanner in = new Scanner(System.in);

    public void test1() {

        int a = in.nextInt();


        if (a >= 14 && a <= 19) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("청소년이 아닙니다.");
        }
    }

    public void test2() {
        char ch1 = in.next().charAt(0);
        System.out.println(ch1 >= 65 && ch1 <= 90);

    }

    public void test3() {
        System.out.print("입력하세요.");
        char ch2 = in.next().charAt(0);
        System.out.println(ch2 == 89 || ch2 == 121);
    }
}
