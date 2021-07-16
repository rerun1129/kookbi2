package Test0716.test3;

public class ExceptionTest {

    static Calculator c = new Calculator();

    public static void main(String[] args) {
        try {
            System.out.println(c.getSum(7));
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        }
    }

}
