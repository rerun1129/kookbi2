package com.kh.bank.controller;


import com.kh.bank.model.vo.Bank;
import com.kh.bank.view.BankMenu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankManager {

    int a = 100;


    public void printInfo() {
        System.out.println("1. 조회");
        System.out.println(">>> 잔액 : " + a + "원");
    }

    public void logIn(Bank[] data, int n) {

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
                System.out.println(data[i].getName()+"님 환영합니다.");
                return;
            } else {
                System.out.println("비밀번호를 " + (m + 1) + "번 잘못 입력하셨습니다.");
                m++;
            }
            if (m == 5) {
                System.out.println("비밀번호를 5회 잘못 입력하셨기 때문에 프로그램을 종료합니다.");
                System.exit(1);
            }
        }
    }
}


