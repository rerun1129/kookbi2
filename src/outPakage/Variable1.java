package outPakage;

public class Variable1 {

    public void method1(int a, int b) {
        System.out.println(a+b);

    }
    public void method2(){

        String name;
        int age;
        char sex;
        String tel;
        boolean married;

        name = "홍씨";
        age = 10;
        sex = 'M';
        tel = "01011111111";
        married = false;

        System.out.println(name +  age + sex + tel);



    }
    public int result(int x){
        return (int) (x*12.5+20.2);
    }
}
