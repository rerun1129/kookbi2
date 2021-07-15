package JavaAPI.throwTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class IoTest {

    public void ioTest1() {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("data1.txt"));
            String str = "";
            do {
                str = br.readLine();
                if (str != null) {
                    System.out.println("내용 : " + str);
                }
            } while (str != null);
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");

        } catch (IOException e) {

            System.out.println("파일 읽는 중 문제 발생!");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("반납 도중 문제 발생!");
            }
        }
    }

    public void ioTest2() {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String str = "";

            do {

                str = br.readLine();
                if (str != null) {
                    System.out.println("내용 : " + str);
                }

            } while (str != null);

        } catch (IOException e) {
            // 다형성을 활용하여 여러 예외를 한 번에 처리할 수도 있다.
            e.printStackTrace();
        }
    }
}

