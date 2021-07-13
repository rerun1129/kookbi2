package Practice;

public abstract class SuperClass {

    private int num1;
    private String str;

    public SuperClass(){

    }

    public SuperClass(int num1, String str) {
        this.num1 = num1;
        this.str = str;
    }

    public abstract String print();

    public int getNum1(){
        return num1;
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public String getStr(){
        return str;
    }

}
