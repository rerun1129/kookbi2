package com.kh.prac;



public class Practice {
    public void prac() {
        boolean trafficBlue = true;
        boolean trafficRed = !trafficBlue;
        System.out.println(trafficBlue + " 파란색, 건너세요.");
        System.out.println(trafficRed + " 붉은색, 잠시 기다리세요.");
        System.out.println("---------------------------------------------------");

        char[] grade = {'A', 'B', 'C', 'D', 'E'};
        System.out.println("이번 학기 성적은 " + grade[0] + " 입니다.");
        System.out.println("---------------------------------------------------");

        double root2 = 1.4142135623730950488016887242096980785696718753769d;
        System.out.println("루트 2의 근사값은 " + root2 + "입니다.");
        System.out.println("---------------------------------------------------");

        float temper = 25.3f;
        System.out.println("오늘 최고 온도는 " + temper +"도 입니다.");
        System.out.println("---------------------------------------------------");

        byte atom = 118;
        System.out.println("원소번호는 현재 " + atom + "번 까지 할당되어 있습니다.");
        System.out.println("---------------------------------------------------");

        short waiting = 547;
        System.out.println("고객님의 대기번호는 " + waiting + "입니다.");
        System.out.println("---------------------------------------------------");

        int visitor = 147487598;
        System.out.println("올해 한국을 방문한 여행자의 수는 " + visitor + "명 입니다.");
        System.out.println("---------------------------------------------------");

        long AU = 149597870700L;
        System.out.println("태양과 달의 거리는 " + AU + "m 입니다.");
    }
}

