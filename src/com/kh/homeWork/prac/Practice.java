package com.kh.homeWork.prac;

import java.util.Scanner;

public class Practice {
Scanner in = new Scanner(System.in);

    public void example1(){
        System.out.print("첫번째 정수 : ");
        int a = in.nextInt();
        System.out.print("두번째 정수 : ");
        int b = in.nextInt();

        System.out.println("합 : " + (a+b));
        System.out.println("차 : " + (a-b));
        System.out.println("곱 : " + (a*b));
        System.out.println("몫 : " + (a/b));
        System.out.println("나머지 : " + (a%b));

    }
    public void example2(){
        System.out.print("가로 : ");
        double horiz = in.nextDouble();
        System.out.print("세로 : ");
        double verti = in.nextDouble();

        System.out.println("-----------------------------------");
        System.out.println("면적 : " + (horiz * verti));
        System.out.println("둘레 : " + (horiz + verti)*2);

    }
    public void menuViewer(){
        System.out.println("***초기 메뉴***");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("0. 종료");

        System.out.println("-----------------------------------");
        System.out.println("번호 입력");
        int input = in.nextInt();
        switch (input){
            case 1 :
                System.out.println("입력메뉴가 선택되었습니다.");
                break;
            case 2 :
                System.out.println("수정메뉴가 선택되었습니다.");
                break;
            case 3 :
                System.out.println("조회메뉴가 선택되었습니다.");
                break;
            case 4 :
                System.out.println("삭제메뉴가 선택되었습니다.");
                break;
            case 0 :
                System.out.println("프로그램이 종료됩니다.");
                break;
            default :
                System.out.println("번호가 잘못되었습니다.");
                System.out.println("다시 입력하십시오.");
                break;
        }
    }
    public void scoreCalculator(){
        System.out.print("국어 점수를 입력하세요 : ");
        double kook = in.nextDouble();
        System.out.print("영어 점수를 입력하세요 : ");
        double young = in.nextDouble();
        System.out.print("수학 점수를 입력하세요 : ");
        double su = in.nextDouble();
        System.out.println("-----------------------------------");
        System.out.println("총점 : " + (kook + young + su));
        System.out.println("평균 : " + (kook + young + su)/3);
        if(kook >=40 && young >=40 && su >=40 && ((kook + young + su)/3) >=60){
            System.out.println("합격!");
        }else{
            System.out.println("불합격!");
        }

    }
}
