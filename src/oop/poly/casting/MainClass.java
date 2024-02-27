package oop.poly.casting;

public class MainClass {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.n1 = 1;
//    p.n2 = 2;
        p.method1();
        p.method2();
//    p.method3();


        System.out.println("=------------------------------=");
        Child c = new Child();
        c.n1 = 1;
        c.n2 = 2;

        c.method1();
        c.method2();
        c.method3();

        System.out.println("--------------------------------------------");

        //다형성 적용(promotion)

        Parent p2 = new Child();
        p2.n1 = 1;
        p2.method1();
        p2.method2();

        /*
         - 다형성이 적용되면 자식 클래스의
          본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
            (부모의 정보로 자식객체에 접근하면 자식이 확장한 개념에 대한 정보를 알 방법이 없다.)
         - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
         */


    }
}
