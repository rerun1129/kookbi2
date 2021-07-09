package Practice;

import java.util.Scanner;

public class calcMy {

    public void test(){
        //삼항 연산자, 일반논리 연산자 등을 사용하여
        //카페 음료를 취향에 따라 선택하는 코드 구현하기
        //출력 예시 고객명 / 온도 / 사이즈 / 가격
        // 고객명 님은 온도 커피 사이즈 사이즈를 주문하셨습니다. 금액은 가격입니다.
        Scanner in =new Scanner(System.in);

        System.out.print("고객명 : ");
        String customer = in.next();

        System.out.print("온도 : ");
        char temperature = in.next().charAt(0);
        String result = (temperature == 'Y') ? "Ice" : "Hot";

        System.out.print("사이즈 : ");
        String size = in.next();

        System.out.print("가격 : ");
        int price = in.nextInt();


        System.out.println(customer + " 님은 " + result + " 커피 " + size + "사이즈를 주문하셨습니다.");
        System.out.println("금액은 "+ price + "입니다.");

    }
}
