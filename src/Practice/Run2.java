package Practice;

abstract class Run2 {

    public static void main(String[] args) {
       Dog pup1 = new Dog("삼돌이","진도");
       Dog pup2 = new Dog();
       pup2.setName("만식이");
        pup1.bark();
        pup2.play();
        pup1.play();
        Dog.checkBob();
        pup1.printDog();
        pup2.printDog();

    }
}
