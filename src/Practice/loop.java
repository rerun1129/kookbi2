package Practice;

import java.util.Random;
import java.util.Scanner;

public class loop {

    public void test2(){
        Scanner in = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int a = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= a; i++){

                sum += i;
        }
        System.out.println("합계 : " + sum);
    }
    public void test3(){
        int two = 2;
        for(int i = 1; i<10; i++){
            System.out.println(two + "*" + i +"="+(two*i));
        }
    }
    public void test4(){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            int dice = new Random().nextInt(6)+1;
            System.out.println("주사위 : " + (dice+1));
            sum += (dice+1);
        }
        System.out.println("합계 : " + sum);
    }
    public void test5(){
        while (1<5){

        }
    }
}
