import java.util.Scanner;

public class calcL {

    // ! 논리값(Not)
    // !true --> false , !false --> true
        public void testMethod2(){
            System.out.print("정수 입력 :");
            Scanner kb = new Scanner(System.in);
            int a = kb.nextInt();
            if (a % 5 != 0) {
                System.out.println("5의 배수가 아닙니다.");
            } else {
                System.out.println("5의 배수입니다.");
            }
        }
    }
