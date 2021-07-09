package Practice;

import java.util.Scanner;

public class calcT {
    public void recharge(){
        Scanner in =new Scanner(System.in);
        System.out.println("금액 입력 : ");
        int money = in.nextInt();

        String result = (money > 10000) ? "결제가 완료되었습니다." : "잔액이 부족합니다.";

        System.out.println(result);

    }
}
