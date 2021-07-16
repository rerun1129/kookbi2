package reservationD.controller;

import reservationD.model.Information;

import java.util.Scanner;

public class SystemManager {
    Scanner in = new Scanner(System.in);
    public final int capacity = 10;
    public Information[] arr = new Information[capacity];
    private int n = 0;


    public void cancelReserve() {

        System.out.println("");
        System.out.print("승객정보를 삭제할 좌석번호를 선택하세요.");
        int i = in.nextInt();
        if (arr[i - 1].getNumber()==0) {
            System.out.println("이미 삭제되었거나 예약되지 않은 좌석입니다..");
            return;
        }
        arr[i - 1] = null;
        System.out.println("");
        System.out.println("삭제되었습니다.");
        n--;
    }

    public void viewReserve() {
        System.out.println("현재 예약 좌석수 : " + n + "석");
        System.out.println("");
        System.out.print("확인할 승객의 좌석번호를 입력하세요.");
        System.out.println("");
        int i = in.nextInt();
        if (arr[i - 1].getNumber()==0) {
            System.out.println("예약되지 않은 좌석번호입니다.");
            return;
        }
        System.out.println("-------예약 정보--------");
        System.out.println("이름 : " + arr[i - 1].getName());
        System.out.println("성별 : " + arr[i - 1].getSex());
        System.out.println("좌석등급 : " + arr[i - 1].getGrade());
        System.out.println("좌석번호 : " + arr[i - 1].getNumber());
        System.out.println("탑승시간 : " + arr[i - 1].getTime());
        System.out.println("출발지 : " + arr[i - 1].getDeparture());
        System.out.println("도착지 : " + arr[i - 1].getArrival());
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }

    public void checkReserve() {
        System.out.println("");
        System.out.println("예약 가능한 좌석을 확인합니다.");
        System.out.println("");
        System.out.print("확인하고자하는 번호 : ");
        int i = in.nextInt();
        if (arr[i - 1].getNumber() != 0) {
            System.out.println("");
            System.out.println(i + "번 좌석은 예약 불가능합니다.");
            System.out.println("");
        } else if (arr[i - 1].getNumber()==0) {
            System.out.println("");
            System.out.println(i + "번 좌석은 예약 가능합니다.");
            System.out.println("");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void addReserve() {

        System.out.println("");
        System.out.print("예약할 승객의 좌석번호를 입력해주세요.");
        System.out.println("");
        int i = in.nextInt();

        System.out.print("좌석번호 : ");
        int number = in.nextInt();
        System.out.print("이름 : ");
        String name = in.next();
        System.out.print("성별 : ");
        String sex = in.next();
        System.out.print("등급 : ");
        String grade = in.next();
        System.out.print("시간 : ");
        String time = in.next();
        System.out.print("출발지 : ");
        String depar = in.next();
        System.out.print("도착지 : ");
        String arriv = in.next();

        arr[i - 1].setName(name);
        arr[i - 1].setSex(sex);
        arr[i - 1].setGrade(grade);
        arr[i - 1].setNumber(number);
        arr[i - 1].setTime(time);
        arr[i - 1].setDeparture(depar);
        arr[i - 1].setArrival(arriv);

        System.out.println("예약이 완료되었습니다.");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        n++;

    }
}
