import java.util.Scanner;

public class Practice2 {
    Scanner in = new Scanner(System.in);

    public void test() {

        int input = in.nextInt();

        int i = 1;
        int sum = 0;
        while (i < input + 1) {

            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public void test2() {

        int input = in.nextInt();

        for (int i = 1; i < input + 1; i++) {
            if (i % 2 == 0) {
                System.out.print("근");
            } else {
                System.out.print("당");
            }
        }
    }

    public void test3() {
        int input = in.nextInt();
        int i = 1;
        while (i < input + 1) {
            if (i % 2 == 0) {
                System.out.print("근");
            } else {
                System.out.print("당");
            }
            i++;
        }
    }

    public void test4() {
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + " " + (i * j));
            }
            System.out.println("------------------------------------");
        }
    }

    public void test5() {
        String msg = null;

        do {
            System.out.println("문자열 입력");
            msg = in.next();
            System.out.println(" >> 글자 수 : " + msg.length());
        } while (!msg.equals("나가기"));

    }

    public void test6() {
        String msg = null;

        do {
            System.out.println("문자열 입력");
            msg = in.next();
            if (msg.equals("exit")) {
                System.exit(2);
            } else {
                System.out.println(" >> 글자 수 : " + msg.length());
            }
        } while (true);
    }

    public void test7() {
        // jump / label 문법
        //  특정 반복문 위에 라벨을 명시하여
        //  필요할 경우 해당 라벨이 적힌 반복문까지
        //  뛰쳐 나갈 때 사용하는 문법


        while (true) {
            int sum = 0;

            for (int i = 1; i <= 10000; i++) {

                sum += i;

                if (i == 5) {
                    System.out.println("sum : " + sum);
                }
            }
            break;
        }
    }
}
