package vending_machine;

import java.util.Scanner;

public class vender {
    Scanner in = new Scanner(System.in);
    menu infoma = new menu();

    public void function() {
        System.out.println("-- 홍길동's 자판기 프로그램 ver 1.0 --");
        int i = 0;
        while (i < infoma.name.length - 1) {
            infoma.info();
            System.out.println((i + 1) + ". " + infoma.name[i] + " " + infoma.price[i] + "원");
            i++;
        }
        System.out.println("--------------------------------------");


        System.out.print("금액을 투입하세요.");
        System.out.println("");
        int money = in.nextInt();
        if (money <= 0) {
            System.out.print("이용해 주셔서 감사합니다.");
            System.exit(1);
        }
        while (true) {
            infoma.list(money);
            System.out.println("");
            System.out.println("금액을 투입하시겠습니까?");
            int moreMoney = in.nextInt();
            if (moreMoney == -1) {
                System.out.println("금액을 반환합니다.");
                System.out.print("이용해 주셔서 감사합니다.");
                System.exit(0);
            } else if (moreMoney == 0) {
                System.out.println("");
                System.out.println("음료를 선택해주세요.");
                int choose = in.nextInt();
                if (infoma.price[choose - 1] <= money) {
                    System.out.println("");
                    System.out.println(infoma.name[choose - 1] + " 음료를 선택하셨습니다.");
                    System.out.println("");
                    money -= infoma.price[choose-1];
                    System.out.println("");
                } else {
                    System.out.println("");
                    System.out.println("금액이 부족합니다.");
                    System.out.println("");
                }
            } else {
                money += moreMoney;
            }
        }
    }
}


