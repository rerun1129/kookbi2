package vending_machine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class menu {
    int n = 8;
    int[] price = new int[n];
    String[] name = new String[n];

    public void info() {
        int i = 0;
        try {
            Scanner in = new Scanner(new File("data.txt"));
            while (in.hasNext()) {
                name[i] = in.next();
                price[i] = in.nextInt();
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file");
        }
    }

    public void inPrice(int a, int b) {

        if (a < price[b]) {
            for (int i = 0; i < name.length - 1; i++) {
                if (price[i] < price[b]) {
                    System.out.println((i + 1) + ". " + name[i] + " " + price[i] + "원 주문가능");
                } else if (price[name.length - 1] > price[b]) {
                    System.out.println((i + 1) + ". " + name[i] + " " + price[i] + "원");
                }
            }
        }
        System.out.println("");
        System.out.println("현재 투입액은 " + a + "원 입니다.");
    }

    public void list(int a) {

        if (a < price[0]) {
            System.out.println("주문 가능한 음료수가 없습니다.");
            System.out.println("현재 투입액은 " + a + "원 입니다.");
        } else if (a < price[1]) {
            inPrice(a, 1);
        } else if (a < price[2]) {
            inPrice(a, 2);
        } else if (a < price[3]) {
            inPrice(a, 3);
        } else if (a < price[4]) {
            inPrice(a, 4);
        } else if (a < price[5]) {
            inPrice(a, 5);
        } else if (a < price[6]) {
            inPrice(a, 6);
        } else {
            inPrice(a, n-1);
        }
    }
}
