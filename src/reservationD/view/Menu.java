package reservationD.view;

import reservationD.controller.SystemManager;
import reservationD.model.Information;

import java.util.Scanner;

public class Menu {

    Scanner in = new Scanner(System.in);
    SystemManager sm = new SystemManager();
    private final int capacity = 10;


    public void commandLine() {
        for (int i = 0; i < capacity; i++) {
            sm.arr[i] = new Information();
        }

        while (true) {
            System.out.println("----@@항공 좌석 예약 프로그램----");
            System.out.println("");
            System.out.println("----1. 예약");
            System.out.println("----2. 좌석여부확인");
            System.out.println("----3. 승객정보조회");
            System.out.println("----4. 예약취소");
            System.out.println("----0. 나가기");
            System.out.println("");
            System.out.print("----메뉴선택 : ");

            int input1 = in.nextInt();
            switch (input1) {

                case 1:
                    System.out.println("예약을 선택하셨습니다.");
                    sm.addReserve();
                    break;
                case 2:
                    System.out.println("좌석확인을 선택하셨습니다.");
                    sm.checkReserve();
                    break;
                case 3:
                    System.out.println("조회를 선택하셨습니다.");
                    sm.viewReserve();
                    break;
                case 4:
                    System.out.println("예약취소를 선택하셨습니다.");
                    sm.cancelReserve();
                    break;
                case 0:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
    }
}
