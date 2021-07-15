package outPakage;

import java.io.Serializable;

public interface IProduct extends Serializable {

    int num1 = 100;     //인터페이스이 필드상수(psf가 기본이기 때문에 생략가능)

    //인터페이스 메소드( public abstract 생략가능)

   void testMethod();


}
