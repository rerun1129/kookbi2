package empMan;

import java.util.Arrays;
import java.util.Scanner;

public class empMenu {
    Scanner in = new Scanner(System.in);

    private int n = 0;
    private int capacity = 2;
    Employee[] empArray = new Employee[capacity];

    public void display() {

        while (true) {
            System.out.println("---사원 관리 프로그램---");
            System.out.println("현재 사원 수 : " + n + "명");
            System.out.println("현재 정원 : " + capacity + "명");
            System.out.println("1. 정보 입력");
            System.out.println("2. 정보 수정");
            System.out.println("3. 정보 삭제");
            System.out.println("4. 정보 조회");
            System.out.println("5. 정보 정렬");
            System.out.println("0. 나가기");
            System.out.println("---------------------");
            System.out.print(" 메뉴 선택 >> ");
            int select = in.nextInt();
            switch (select) {
                case 1:
                    System.out.println("사원 정보 입력");
                    empAdd();
                    break;
                case 2:
                    System.out.println("사원 정보 수정");
                    empUpdate();
                    break;
                case 3:
                    System.out.println("사원 정보 삭제");
                    empDel();
                    break;
                case 4:
                    System.out.println("사원 정보 조회");
                    empView();
                    break;
                case 5:
                    System.out.println("사원 정보 정렬");
                    empSort();
                    break;
                case 0:
                    System.out.println("종료");
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
                    break;
            }
        }
    }

    private void empSort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (empArray[j].getEmpNo() > empArray[j + 1].getEmpNo()) {
                    Employee tmp = empArray[j];
                    empArray[j] = empArray[j + 1];
                    empArray[j + 1] = tmp;
                }
            }
        }
    }

    private void empDel() {
        System.out.println("삭제할 사원의 사번을 입력하세요.");
        System.out.println("----삭제 불가능한 사번----");
        if(n==0){
            System.out.println("삭제 가능한 사번이 없습니다.");
            return;
        }
        for(int i = 0; i<n; i++){
            if(empArray[i].getEmpNo() == 0){
                System.out.println((i+1)+"번");
            }
        }
        int i = in.nextInt();
        empArray[i - 1].setTel(null);
        empArray[i - 1].setDpt(null);
        empArray[i - 1].setName(null);
        empArray[i - 1].setEmpNo(0);
        empArray[i - 1].setSalary(0);
        System.out.println("사번 " + i + "번 사원의 정보가 삭제되었습니다.");
        n--;
    }


    private void empUpdate() {
        System.out.println("수정할 사원의 사번을 입력하세요.");
        System.out.println("----수정 불가능한 사번----");
        if(n==0){
            System.out.println("수정 가능한 사번이 없습니다.");
            return;
        }
        for(int i = 0; i<n; i++){
            if(empArray[i].getEmpNo() == 0){
                System.out.println((i+1)+"번");
            }
        }

        int i = in.nextInt();
        Employee tmp = empArray[i - 1];

        System.out.println("현재 연락처 : " + empArray[i - 1].getTel());
        System.out.print("수정할 연락처 : ");
        tmp.setTel(in.next());

        System.out.println("현재 급여 : " + empArray[i - 1].getSalary());
        System.out.print("수정할 급여 : ");
        tmp.setSalary(in.nextInt());

        System.out.println("현재 이름 : " + empArray[i - 1].getName());
        System.out.print("수정할 이름 : ");
        tmp.setName(in.next());

        System.out.println("현재 사번 : " + empArray[i - 1].getEmpNo());
        System.out.print("수정할 사번 : ");
        tmp.setEmpNo(in.nextInt());

        System.out.println("현재 부서 : " + empArray[i - 1].getDpt());
        System.out.print("수정할 부서 : ");
        tmp.setDpt(in.next());

        empArray[i - 1] = tmp;

        System.out.println("사원 정보 수정 완료!");
    }


    private void empView() {
        int m = n;
        System.out.println("사원정보 조회결과");
        for (int i = 0; i < m; i++) {
            if (empArray[i].getEmpNo() != 0) {
                System.out.println(empArray[i].empToString());
            } else if (empArray[i].getEmpNo() == 0) {
                System.out.println("사원 정보가 없습니다.");
                m++;
            }
        }
    }

    private void empAdd() {
        if (n >= capacity) {
            reallocate();
        }

        System.out.println("추가할 사원의 사번을 입력해주세요.");
        System.out.println("----현재 입력가능한 사번----");
        for (int i = 0; i < capacity; i++) {
                System.out.print((i + 1) + "번 ");
        }
        int input = in.nextInt();
        empArray[input-1] = new Employee();
        System.out.print("사원 번호 : ");
        int empNo = in.nextInt();
        empArray[input - 1].setEmpNo(empNo);
        System.out.print("사원 명 : ");
        String name = in.next();
        empArray[input - 1].setName(name);
        System.out.print("부서 : ");
        String dpt = in.next();
        empArray[input - 1].setDpt(dpt);
        System.out.print("연락처 : ");
        String tel = in.next();
        empArray[input - 1].setTel(tel);
        System.out.print("급여 : ");
        int salary = in.nextInt();
        empArray[input - 1].setSalary(salary);


        System.out.println("사원 정보 입력이 완료되었습니다.");


        n++;

    }

    private void reallocate() {
        capacity += 2;
        empArray = Arrays.copyOf(empArray, capacity);
    }
}
