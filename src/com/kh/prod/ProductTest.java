package com.kh.prod;

import java.util.Scanner;

public class ProductTest {

    public void play() {
        Scanner in = new Scanner(System.in);
        Product p = new Product();

        p.setName(in.nextLine());
        p.setPrice(in.nextInt());
        p.setQuantity(in.nextInt());

        System.out.println(p.information());
        System.out.println("총 구매 가격 : " + p.getPrice() * p.getQuantity() + " 원");
        in.close();

    }
    public static void main(String[] args) {
        ProductTest app = new ProductTest();
        app.play();
    }
}
