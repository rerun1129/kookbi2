package JavaAPI;

import java.util.StringTokenizer;

public class StringMethods {

    public static void main(String[] args) {
        StringMethods sm = new StringMethods();
        //sm.stringBuffer();
        //sm.stringBuilder();
        sm.split();

    }

    private void stringBuffer() {
        StringBuffer sb = new StringBuffer();

        sb.append("Hello");

        System.out.println(sb.hashCode());

        sb.append("World");

        System.out.println(sb.hashCode());

        System.out.println(sb);

    }

    public void test1() {
        String str1 = "HW!";
        String str2 = "HW!";
        String str3 = new String("HW!");

        System.out.println(str1 == str2);         //본래 두 객체의 주소는 달라야 하나 같은 저장공간을 바라보고 있기 때문 true가 된다.
        System.out.println(str1 == str3);         //str3은 아예 객체를 따로 생성했기 때문에 주소가 다르다.
    }                                           //str1,2는 String 저장공간인 String에 저장되었고 str3는 Heap에 저장되어서 발생한 결과이다.

    private void stringBuilder() {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");

        System.out.println(sb.hashCode());

        sb.append("World");

        System.out.println(sb.hashCode());

        System.out.println(sb);

    }

    public void split() {
        String str = "010 -,2171 -,9359";
        String[] strArr = str.split(" -,");
        for (String s : strArr) {
            System.out.print(s);
        }
        System.out.println();
        StringTokenizer token = new StringTokenizer(str);
        while (token.hasMoreTokens()){
            System.out.print(token.nextToken(" -,"));
        }
        System.out.println(String.join(" -,",str));
    }
}



