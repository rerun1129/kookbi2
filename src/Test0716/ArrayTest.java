package Test0716;

public class ArrayTest {

    int[][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
    double sum = 0;
    double avg = 0;

    public static void main(String[] args) {
        ArrayTest at = new ArrayTest();

        for(int i = 0; i<at.array.length; i++){
            for (int j = 0; j<at.array[i].length; j++){
                at.sum += at.array[i][j];
                at.avg = at.sum/(at.array.length*at.array[i].length);
            }
        }
        System.out.println("합계 : " + at.sum);
        System.out.println("평균 : " + at.avg);
    }
}
