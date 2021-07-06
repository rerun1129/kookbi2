import java.util.Scanner;

public class Practice3 {
    Scanner in = new Scanner(System.in);

    public void test1() {
        int[] itg = new int[5];
        int sum = 0;
        for (int i = 0; i < itg.length; i++) {
            itg[i] = (i + 1) * 100;
            sum += itg[i];
        }
        System.out.println(sum);
    }

    public void test2() {
        String str = in.next();
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (int j = str.length() - 1; j >= 0; j--) {
            System.out.print(ch[j]);
        }
    }

    public void test3() {
        // 2차원 배열 선언하기
        // 3 * 3

        int[][] arr = new int[5][5];

        // 2차원 배열에 값 추가하기
        int number = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = number++;
                if (number < 11) {
                    System.out.print(" " + arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void test4() {
        int[][] arr = new int[5][5];
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3d", arr[j][i]);
            }
            System.out.println();
        }
    }
}
