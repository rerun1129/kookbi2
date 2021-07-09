package Practice;

import java.util.Scanner;

public class calcM {

    public void testMethod(){
        int num1 = 10;
        int num2 = 20;
        System.out.println("더하기 : " + (num1 + num2));
        System.out.println("빼기 : " + (num1 - num2));
        System.out.println("곱하기 : " + (num1 * num2));
        System.out.println("나누기 : " + (num1 / num2));
        System.out.println("나머지 : " + (num2 % num1));

        System.out.println(10 + 'A');
    }
    public void testUnicode(){
        Scanner tu = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String str = tu.next();
        char ch = str.charAt(2);
        int num = ch;
        System.out.println(ch+"에 해당하는 유니코드 숫자는 "+num+"입니다.");

    }
}
