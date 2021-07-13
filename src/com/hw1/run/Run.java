package com.hw1.run;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

import java.util.Scanner;

public class Run {

    public void sInfo() {
        Student[] s = new Student[3];
        s[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        s[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        s[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (Student student : s) {
            System.out.println(student.information());
        }
    }
    public void eInfo(){
        Employee [] e = new Employee[10];
        int n = 0;
        Scanner in = new Scanner(System.in);

        String str;
        do{
            System.out.println("사원 정보를 입력하세요.");
            e[n] = new Employee();
            e[n].setName(in.next());
            e[n].setAge(in.nextInt());
            e[n].setHeight(in.nextDouble());
            e[n].setWeight(in.nextDouble());
            e[n].setSalary(in.nextInt());
            e[n].setDept(in.next());

            n++;

            System.out.println("계속 입력하시겠습니까?");
            str = in.next();
        }while (str.equals("y"));
        for (int i = 0; i<n; i++){
        System.out.println(e[i].information());
        }
    }


    public static void main(String[] args) {
        Run app = new Run();
        app.sInfo();
        app.eInfo();

    }
}
