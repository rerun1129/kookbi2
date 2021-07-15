package JavaAPI.throwTest;

import java.util.Scanner;

public class MyExceptionTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("나이 입력 : ");
        int age = in.nextInt();

        MyExceptionTest my = new MyExceptionTest();

        try {
            my.checkAge(age);
        } catch (AgeException e) {

            //e.printStackTrace();
            System.out.println(e.getMessage());
        }


    }

    public void checkAge(int age) throws AgeException{
        if (age > 18) {
            System.out.println("성인");
        } else {
            throw new AgeException("학생");
        }
    }
}
