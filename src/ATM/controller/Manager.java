package ATM.controller;

import ATM.model.vo.AtmTotal;

import java.util.Scanner;

public class Manager {


    public void AtmView(AtmTotal[] user, int i) {
        System.out.println("잔액 : " + user[i].getBalance() + "원 입니다.");
    }

    public int Verification(AtmTotal[] user) {
        Scanner in = new Scanner(System.in);

        System.out.print("계좌 입력 : ");
        String ac = in.next();
        int i;
        for (i = 0; i < user.length; ) {
            if (user[i].getAccount().equals(ac)) {
                System.out.println(user[i].getName() + "님 환영합니다.");
                break;
            }
            if (!user[i].getAccount().equals(ac)) {
                i++;
            }
            if (i == 5) {
                System.out.println("계좌 번호가 없습니다.");
                i = 0;
                System.out.print("계좌 입력 : ");
                ac = in.next();
            }
        }
        return i;
    }

    public void AtmWith(AtmTotal[] user, int i) throws ShortageException {
        Scanner in = new Scanner(System.in);
        System.out.println("얼마를 출금하시겠습니까?");
        int money = in.nextInt();
        if (money < user[i].getBalance()) {
            user[i].setBalance(user[i].getBalance() - money);
            System.out.println(money + "원을 출금하였습니다.");
        } else {
            throw new ShortageException("잔액이 부족합니다.");
        }
    }

    public void AtmSend(AtmTotal[] user, int i) throws ShortageException {
        Scanner in = new Scanner(System.in);
        System.out.println("얼마를 이제하시겠습니까?");
        int money = in.nextInt();
        if (money > user[i].getBalance()){
            throw new ShortageException("잔액이 부족합니다.");
        }

        System.out.println("누구에게 이제하시겠습니까?");
        String nm = in.next();
        int j;
        for (j = 0; j < user.length; ) {
            if (user[j].getName().equals(nm)) {
                break;
            }
            if (!user[j].getName().equals(nm)) {
                j++;
            }
            if (j == 5) {
                System.out.println("고객님이 없습니다.");
                j = 0;
                System.out.print("누구에게 이제하시겠습니까?");
                nm = in.next();
            }
        }
        if(user[i].getName().equals(user[j].getName())){
            System.out.println("자기 자신에게 이체할 수 없습니다.");
            return;
        }
        System.out.println(user[j].getName() + "님께 " + money + "원 이체하였습니다.");
        user[i].setBalance(user[i].getBalance() - money);
        user[j].setBalance(user[j].getBalance() + money);

    }

    public void AtmIn(AtmTotal[] user, int i) {
        Scanner in = new Scanner(System.in);
        System.out.println("얼마를 입금하시겠습니까?");
        int money = in.nextInt();
        System.out.println(money + "원을 입금하였습니다.");
        user[i].setBalance(user[i].getBalance() + money);
    }
}
