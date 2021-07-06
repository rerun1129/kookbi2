abstract class Run2 {

    static int a = 10;


    public static void main(String[] args) {
        fieldTest();


    } public void test1 () {
            new object().name = "철수";
            new object().gender = 'M';
            new object().age = 10;
            //new object().tel = "010";
        }
        public static void fieldTest () {
            FieldTest ft1 = new FieldTest();

            System.out.println(ft1.PI);

            FieldTest ft2 = new FieldTest();

            System.out.println(ft2.PI);

        }
}
