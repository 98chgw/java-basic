package oop.poly.casting;

public class Child extends Parent{

    public int n2; //자식 고유의필드

    public void method2() {
        System.out.println("재정의한 2번 메서드를 호출!");
    }
    public void method3() {
        System.out.println("자식 고유의 3번 메서드 호출!");
    }
}
