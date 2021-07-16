package Test0716.test4;


import java.util.Scanner;

public class PlaneTest {

    public static void main(String[] args) {
        Plane a = new Airplane("L747", 1000);
        Plane c = new CargoPlane("C40",1000);

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Plane          ");
            System.out.println("fuelSize");
            System.out.println("-----------------------");
            System.out.println(a.getPlaneName() + "           " + a.getFuelSize());
            System.out.println(c.getPlaneName() + "            " + c.getFuelSize());

            System.out.print("어떤 업무를 하시겠습니까 : ");
            String command = in.next();

            if(command.equals("운항")){
                System.out.print("운항 거리를 입력해주세요 : ");
                int distance = in.nextInt();
                if(distance == 0){
                    System.out.println("운항을 종료합니다.");
                    return;
                }else {
                    System.out.println((distance) + " 운항");
                    a.flight(distance);
                    c.flight(distance);
                }
            }else if(command.equals("주유")){
                System.out.print("주유량을 입력해주세요 : ");
                int re = in.nextInt();
                a.refuel(re);
                c.refuel(re);
            }else if(command.equals("종료")){
                break;
            }
            else{
                System.out.println("잘못 입력하셨습니다.");
            }
        }while (true);
    }
}
