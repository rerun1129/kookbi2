import java.util.Scanner;

public class InputVariable {
    public void inputMethod() {
        Scanner in = new Scanner(System.in);

        System.out.println(in.next() + in.next());
    }
    public void myInputMethod(){
        //실습 1.
        //기본 자료형 3가지 이상을 사용하여
        //도서의 정보를 입력받는 프로그램을 만들어 보자.
        //변수의 이름은 성의있게
        Scanner in = new Scanner(System.in);

        System.out.print("제목 :");
        String title = in.nextLine();

        System.out.print("평점 :");
        float grade = in.nextFloat();

        in.nextLine();
        System.out.print("작가 :");
        String writer = in.nextLine();

        System.out.print("페이지수 :");
        int pages = in.nextInt();

        System.out.print("대여 :");
        boolean isRental = in.nextBoolean();


        System.out.println("제목 : " + title);
        System.out.println("평점 : " + grade + "점");
        System.out.println("작가 : " + writer);
        System.out.println("페이지수 : " + pages + "p");
        if(isRental == true){
            System.out.println("대여 : 대여중");
        }else{
            System.out.println("대여 : 가능");
        }
    }
}
