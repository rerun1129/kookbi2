package vending_machine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class menu {
    int n = 10;
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
            in.close();
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

        for (int i = 1; i < n; i++) {
            if (a < price[0]) {
                System.out.println("주문 가능한 음료수가 없습니다.");
                System.out.println("현재 투입액은 " + a + "원 입니다.");
                break;
            } else if (a < price[i]) {
                inPrice(a, i);
                break;
            }
        }
    }
}
