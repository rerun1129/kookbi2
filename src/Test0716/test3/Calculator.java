package Test0716.test3;

public class Calculator {

    public double getSum(int data) throws InvalidException {
        double sum = 0;
        for (int i = 1; i < data + 1; i++) {
            if (data == 1 || data > 5) {
                throw new InvalidException("입력 값에 오류가 있습니다.");
            } else {
                sum += i;
            }
        }
        return sum;
    }
}