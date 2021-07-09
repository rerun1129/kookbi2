package Cf.run;

import Cf.model.Coffee;
import Cf.model.Tea;

public class Main {
    public static void main(String[] args) {
        Coffee c1 = new Coffee("아메리카노", "한국", "라지", 5000, 2, "Hot");
        Coffee c2 = new Coffee("민초라떼", "한국", "벤티", 13500, 0, "Ice");
        Tea t1 = new Tea("홍자", "영국", "스몰", 3000, "겨울", false);

        System.out.println(c1.drinkToString());
        System.out.println(c2.drinkToString());
        System.out.println(t1.drinkToString());


    }
}
