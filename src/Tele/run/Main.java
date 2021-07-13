package Tele.run;

import Tele.model.vo.Product;
import Tele.model.vo.SmartPhone;
import Tele.model.vo.TV;
import Tele.model.vo.Tablet;

public class Main {

    public static void main(String[] args) {
        Product tv = new TV("스마트",1000);            //업 캐스팅(서브 클래스의 매서드는 사용 불가)자동 형변환
        Product sp = new SmartPhone("갤럭시",100);
        Product tab = new Tablet("서피스", 200);

        ((Tablet)tab).write();                                      //다운 캐스팅(서브 클래스의 매서드 사용가능)하향 형변환(강제)

        //TV tv1 = new Product();
        Product [] products = new Product[3];

        products[0] = tv;                       //자동 형변환
        products[1] = sp;
        products[2] = tab;

        for (Product p : products) {
           // TV t = (TV)p;       // 하향 형변환(강제)
           if(p instanceof TV){
               //A instanceof B : A를 B로 바꿀수 있는지?
               TV t = (TV)p;
           }
        }
    }
}
