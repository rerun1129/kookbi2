package Practice;

import java.util.Scanner;

public class game {

    public void playGame() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("가위/바위/보 를 선택하세요 : ");
            String human = in.next();
            if(human.equals("멈춰!")){
                System.out.println("멈춰!!!");
                System.exit(1);
            }
            System.out.println(human + "를 내셨습니다.");

            int choice = (int) (Math.random() * 3);  // 0 ~ 2
            String com = null;
            if (choice == 0) {
                com = "바위";
            } else if (choice == 1) {
                com = "가위";
            } else if (choice == 2) {
                com = "보";
            }
            switch (com) {
                case "바위":
                    switch (human) {
                        case "가위":
                            System.out.println("패배!");
                            break;
                        case "바위":
                            System.out.println("무승부!");
                            break;
                        case "보":
                            System.out.println("승리!");
                            break;
                    }
                    break;
                case "가위":
                    switch (human) {
                        case "가위":
                            System.out.println("무승부!");
                            break;
                        case "바위":
                            System.out.println("승리!");
                            break;
                        case "보":
                            System.out.println("패배!");
                            break;
                    }
                    break;
                case "보":
                    switch (human) {
                        case "가위":
                            System.out.println("승리!");
                            break;
                        case "바위":
                            System.out.println("패배!");
                            break;
                        case "보":
                            System.out.println("무승부!");
                            break;
                    }
                    break;
            }
            in.close();
        }
    }
}
