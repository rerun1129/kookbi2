package com.kh.test;

import java.util.Scanner;

public class BookArrayTest {

    Book bArray [] = new Book[3];
    Scanner in = new Scanner(System.in);
    public void play(){

        for(int i = 0; i< bArray.length; i++){
            bArray[i] = new Book();

            System.out.println("도서 정보를 입력해주세요.");
            System.out.print("제목 : ");
            bArray[i].setTitle(in.nextLine());
            System.out.print("저자 : ");
            bArray[i].setAuthor(in.next());
            System.out.print("가격 : ");
            bArray[i].setPrice(in.nextInt());
            System.out.print("출판사 : ");
            bArray[i].setPublisher(in.next());
            System.out.print("할인율 : ");
            bArray[i].setDiscountRate(in.nextDouble());
            in.nextLine();
            System.out.println("정보 입력이 " + (i+1) + "번째 완료 되었습니다.");
            System.out.println("-----------------------------------------");
        }
        for (Book book : bArray) {
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " +
                    book.getPublisher() + ", " + book.getPrice() + "원" + ", " +
                    (book.getDiscountRate() * 100) + "% 할인");
            System.out.println("할인된 가격 : " + book.getPrice() * (1 - book.getDiscountRate()) + "원");
        }
    }
    public static void main(String[] args) {
        BookArrayTest app = new BookArrayTest();
        app.play();
    }
}
