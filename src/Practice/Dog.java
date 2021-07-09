package Practice;

public class Dog {

    private String name;
    private String type;
    private char gender;
    private int age;
    private double weight;

    private static int bobCount = 10;

    public Dog(){

    }

    public Dog(String name){
        this.name = name;

    }
    public Dog(String name, String type){
        this.name = name;
        this.type = type;
    }
    public void bark(){
        System.out.println(name+"체력소모안함");
    }
    public void play(){
        System.out.println(name+"체력소모");
        bobCount--;
    }

    public static void checkBob(){
        System.out.println(bobCount+"개 밥이 남았습니다.");
    }

    public void printDog(){
        System.out.println(name + ", " + type + ", " + gender + ", " + age + ", " + weight);
    }
    public void setName(String name){
     this.name = name;
    }
    public String getDog(){
        return name;
    }
}
