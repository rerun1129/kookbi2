package com.kh.bank.controller;


import com.kh.bank.model.vo.Bank;
import com.kh.bank.view.BankMenu;

import java.util.Scanner;

public class BankManager {

    BankMenu bm = new BankMenu();

    int count = 5;


    public void printInfo(Bank[] data, int i) {

        System.out.println(">>> 잔액 : " + data[i].getBalance() + "원");

    }

    public int logIn(Bank[] data, int n) {

        Scanner in = new Scanner(System.in);
        System.out.print("계좌번호 : ");
        String ac = in.next();
        int i;
        for (i = 0; i < n; ) {
            if (data[i].getAccount().equals(ac)) {
                break;
            } else if (!data[i].getAccount().equals(ac)) {
                i++;
            }
            if (i == n) {
                System.out.println("계좌번호 오류.");
                i = 0;
                System.out.print("계좌번호 : ");
                ac = in.next();
            }
        }
        int m = 0;
        while (m < 5) {
            System.out.print("비밀번호 : ");
            String pw = in.next();
            if (data[i].getPw().equals(pw)) {
                System.out.println(data[i].getName() + "님 환영합니다.");
                break;
            } else {
                System.out.println("비밀번호를 " + (m + 1) + "번 잘못 입력하셨습니다.");
                m++;
            }
            if (m == 5) {
                System.out.println("비밀번호를 5회 잘못 입력하셨기 때문에 프로그램을 종료합니다.");
                System.exit(1);

            }

        }
        return i;
    }


    public void withdrawal(Bank[] data, int i) {
        System.out.println("얼마를 출금하시겠습니까?");
        Scanner sc = new Scanner(System.in);
        int wd = sc.nextInt();

        if (data[i].getBalance() >= wd) {
            System.out.println(wd + "원을 출금하였습니다.");
            System.out.println("잔액 : " + (data[i].getBalance() - wd) + "원");
            data[i].setBalance(data[i].getBalance() - wd);
        } else {
            System.out.println("잔액이 부족합니다!");
        }
    }

    public void remittance(Bank[] data, int i) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" 현재 잔액 :  " + data[i].getBalance() + "원");

        System.out.print(" 입금받으실 분의 계좌번호를 적어주십시오 :  ");
        String account = sc.next();

        int j;
        for (j = 0; j < count; ) {
            if (data[j].getAccount().equals(account)) {
                break;
            } else if (!data[j].getAccount().equals(account)) {
                j++;
            }
            if (j == count) {
                System.out.println("계좌번호 오류.");
                j = 0;
                System.out.print("입금받으실 분의 계좌번호를 적어주십시오 : ");
                account = sc.next();
            }
        }


        System.out.print(data[j].getName() + "님 께 얼마를 송금하시겠습니까?:   ");
        int money = sc.nextInt();

        if (money < data[i].getBalance()) {
            System.out.println(data[j].getName() + " 님께 " + money + " 원 송금하셨습니다. ");
            data[i].setBalance(data[i].getBalance() - money);
            data[j].setBalance(data[j].getBalance() + money);
        } else {
            System.out.println("잔액이 부족합니다.");
        }
        System.out.println(" 잔액 :  " + data[i].getBalance() + " 원");
    }

    public void deposit(Bank[] data, int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>> 얼마를 입금하시겠습니까?");
        int price = sc.nextInt();
        data[i].setBalance(data[i].getBalance() + price);
        System.out.println(price + "원을 입금하였습니다.");
        System.out.println("잔액 : " + data[i].getBalance() + "원");
    }
}





