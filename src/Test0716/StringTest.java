package Test0716;

import java.text.DecimalFormat;

public class StringTest {
    public static void main(String[] args) {
        String str = "1.22#4.12#5.93#8.71#9.34";
        double[] data = new double[5];
        double sum = 0;
        double avg = 0;
        String[] st;

        for (int i = 0; i < data.length; i++) {

            st = str.split("#");
            data[i] = Double.parseDouble(st[i]);
            sum += data[i];
            avg = sum / data.length;
        }
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
