package ATM.view;

import ATM.controller.Manager;
import ATM.model.vo.AtmTotal;

import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);

    Manager mng = new Manager();


    public void display() throws Exception {

        AtmTotal [] user = new AtmTotal[5];


        user[0] = new AtmTotal("석광원","11022477898",100000);
        user[1] = new AtmTotal("금강선","11022474598",100000);
        user[2] = new AtmTotal("김회장","11034577898",100000);
        user[3] = new AtmTotal("강과장","11022434898",100000);
        user[4] = new AtmTotal("이대리","11022477800",100000);


        int man = mng.Verification(user);
        do {
            System.out.println("--------메뉴--------");
            System.out.println("1. 조회");
            System.out.println("2. 출금");
            System.out.println("3. 이체");
            System.out.println("4. 입금");
            System.out.println("0. 종료");
            System.out.println(">>> 메뉴선택");
            int input = in.nextInt();

            switch (input){
                case 1:
                    mng.AtmView(user,man);
                    break;
                case 2:
                    mng.AtmWith(user,man);
                    break;
                case 3:
                    mng.AtmSend(user,man);
                    break;
                case 4:
                    mng.AtmIn(user,man);
                    break;
                case 0:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        } while (true);
    }
}
