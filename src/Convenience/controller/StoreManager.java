package Convenience.controller;

import Convenience.model.vo.Cvs;

import java.util.Scanner;



public class StoreManager {
    Scanner sc = new Scanner(System.in);
    public static final int SIZE = 100;
    private Cvs[] prodArr = new Cvs[SIZE];
    private int count;
    public void addProd() {

        System.out.print("물품 이름을 입력해주세요 : ");
        String name = sc.next();
        System.out.print("물품 가격을 입력해주세요 : ");
        int price = sc.nextInt();
        System.out.print("물품 갯수를 입력해주세요 : ");
        int stock = sc.nextInt();
        System.out.print("원산지를 입력해주세요 : ");
        String origin = sc.next();


        prodArr[count] = new Cvs(name, price, stock, origin);
        count++;
        System.out.println("등록이 완료되었습니다.\n\n\n");
    }



    public void sellProd() {

        System.out.print("판매할 물품 이름 : ");
        String name = sc.next();

        boolean check = false;  // 찾는 물품
        int idx = -1;

        for(int i = 0 ; i < count ; i++ ) {
            if ( prodArr[i].getName().equals(name) ) {
                check = true;
                idx = i;
                break;
            }
        }
        if( check ) {
            System.out.println("현재 물품 재고 : " + prodArr[idx].getStock());
            System.out.print("판매후 남을 재고 : ");
            prodArr[idx].setStock(sc.nextInt());

            System.out.println("재고 정보 수정 완료! \n\n\n");
        } else {
            System.out.println("해당하는 물품이 없습니다. \n\n\n");
        }
    }


    public void deleteProd() {
        System.out.print("폐기할 물품 이름 : ");
        String name = sc.next();

        boolean check = false;

        int idx = -1; //
        for (int i = 0; i < count; i++) {
            if (prodArr[i].getName().equals(name)) {

                check = true;
                idx = i;
                break;
            }
        }
        if (check) {
            for (int i = idx; i < count; i++) {

                if (i == count - 1) {
                    prodArr[i] = null;
                } else {
                    prodArr[i] = prodArr[i + 1];
                }
            }
            count--;
            System.out.println("물품정보가 삭제되었습니다!\n 폐기 후 남은 갯수는 재등록이 필요합니다.\n\n");
        } else {
            System.out.println("해당하는 사원이 없습니다");
        }

    }

    public void printALLProd() {
        for (int i = 0; i < count; i++) {
            System.out.println(prodArr[i].productToString());

        }
        System.out.println("\n\n\n");
    }





}

