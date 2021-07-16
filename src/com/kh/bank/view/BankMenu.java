package com.kh.bank.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.kh.bank.controller.BankManager;
import com.kh.bank.model.vo.Bank;

public class BankMenu {



    public static void display() {

        Bank[] bank = new Bank[5];


        bank[0] = new Bank("3643", "4875414785221", 1000000L, "고윤석");
        bank[1] = new Bank("2680", "299559469724", 1000000L, "이승병");
        bank[2] = new Bank("3606", "3920348293843", 1000000L, "박희진");
        bank[3] = new Bank("9485", "0756788976522", 1000000L, "최정윤");
        bank[4] = new Bank("2073", "3333072779383", 1000000L, "장민수");

        BankManager bm = new BankManager();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("☆☆KH BANK 사용자 메뉴☆☆");

            bm.logIn(bank, 5);

            System.out.println("1 >> 조회");
            System.out.println("2 >> 입금");
            System.out.println("3 >> 송금");
            System.out.println("4 >> 출금");
            System.out.println("0. 프로그램 종료");
            System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
            System.out.print("메뉴 선택 >> ");
            int select = sc.nextInt();

            switch (select) {

                case 1:
                    bm.printInfo();
                    break;
                case 2:
                    //bm.deposit();
                    break;
                case 3:
                    // bm.remittance() ;

                    break;
                case 4:
                    //bm.withdrawal();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 입력입니다!");

            }
        } while (true);
    }
}

