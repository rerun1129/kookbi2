package JavaAPI.IOstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TBS {
    //입력 : OutputStream
    //입력 : InputStream

    public void fileOpen1() {
        // 특정 데이터를 파일로부터 읽어오는 메서드
        //fis 는 try 안의 지역변수이다.
        try (FileInputStream fis = new FileInputStream("data1.txt")) {
            int value = 0;
            while (value != -1) {
                value = fis.read();  //파일로부터 1바이트씩 읽기
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일 없음.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

