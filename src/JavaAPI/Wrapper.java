package JavaAPI;

import outPakage.IProduct;

public class Wrapper {
    public static void main(String[] args) {
        Wrapper a = new Wrapper();
        a.test();

    }

    public void test(){

        byte b = Byte.parseByte("10");          //문자열 >> 프리미티브 타입
        short s = Short.parseShort("100");
        int i = Integer.parseInt("500");
        long l = Long.parseLong("2500000000");

        char c = "C".charAt(0);

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

    }

    public void stringParse(){
        String str = String.valueOf(100);

    }

}
