import java.util.Scanner;

public class Mylogic {
    Scanner in = new Scanner(System.in);

    public void test1() {
        /**
         정수 하나를 입력받아
         직각 삼각형을 다음과 같이
         출력 하시오.
         입력 : 5
         *
         **
         ***
         ****
         *****

         hint : print / println 활용
         */

        System.out.print("삼각형 밑변의 길이를 적으세요.");
        int input = in.nextInt();

        for (int i = 1; i < input + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void test2() {
        /** 가로와 세로 길이를 정수로
         각각 입력받아 직사각형을
         * 로 출력 하시오
         가로 : 5
         세로 : 3
         *****
         *****
         *****

         hint : print / println 활용
         */
        System.out.println("삼각형 가로세로의 길이를 적으세요.");
        System.out.print("가로");
        int horiz = in.nextInt();
        System.out.print("세로");
        int verti = in.nextInt();

        for (int i = 1; i < verti + 1; i++) {
            for (int j = 1; j < horiz + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public void test3() {
        /**
         문자열 값을 입력받고, 그 다음 문자 하나를 입력받아,
         문자열 값 안에 입력문자가 몇 개 존재하는지 그 갯수를 출력함
         단, 영문자만 입력받도록 함.

         ex>
         문자열 입력 : application
         문자 입력 : p
         포함된 갯수 : 2 개
         ====================
         문자열 입력 : apple_test123
         영문자가 아닙니다.
         */


        while (true) {
            int sum = 0;
            System.out.print("문자열 입력 : ");
            String str1 = in.next();
            for (int j = 0; j < str1.length(); j++) {
                if (!(str1.charAt(j) >= 65) && !(str1.charAt(j) >= 90)) {
                    System.out.println("영문자가 아닙니다.");
                    System.exit(1);
                }
            }
                System.out.print("문자 입력 : ");
                char str2 = in.next().charAt(0);
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) == str2) {
                        sum++;
                    }
                }
                System.out.println("포함된 갯수 : " + sum + " 개");
                System.out.println("=======================");
            }
        }
    }

