package Practice;

public class array {
    public void test2() {
        // 2. 깊은 복사
        // 배열의 주소가 아닌 실제 배열의 값들을
        // 복사하여 새로운 배열을 만드는 방법

        int[] origin1 = {1, 2, 3, 4, 5};
        int[] copy1 = new int[origin1.length];

        // 1) for 반복문을 사용하는 방법
		/*
		for( int i = 0 ; i < origin1.length ; i++) {
			copy1[i] = origin1[i];
		}
		*/

        // 2) System.arraycopy(복사할 원본 배열, 복사 시작번호,
        //                     사본 배열, 복사해서 넣을 시작 번호, 복사할 갯수)
        //System.arraycopy(origin1, 0, copy1, 0, origin1.length);

        // 3) clone() 메소드 사용하기
        //copy1 = origin1.clone();

        origin1[2] = 7;

        // 출력
        for (int i = 0; i < origin1.length; i++) {
            System.out.println("원본 : " + origin1[i]);
            System.out.println("사본 : " + copy1[i]);

        }
    }
}