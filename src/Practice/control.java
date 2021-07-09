package Practice;

import java.util.Scanner;

public class control {
    Scanner in = new Scanner(System.in);

    public void condition() {

        System.out.println("마스크를 착용하셨나요? <Y/N>");
        char ch = in.next().charAt(0);
        if (ch == 'Y') {
            System.out.println("이용해주셔서 감사합니다.");
        } else if (ch == 'N') {
            System.out.println("마스크를 착용해주세요.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    public void test2() {
        System.out.print("수학점수 : ");
        int math = in.nextInt();
        System.out.print("국어점수 : ");
        int lan = in.nextInt();
        System.out.print("영어점수 : ");
        int eng = in.nextInt();

        double avg = (math + lan + eng) / 3;
        char grade;

        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else{
            grade = 'F';
        }
        System.out.println("이번 학기 학점은 " + grade + " 입니다.");
    }

}

