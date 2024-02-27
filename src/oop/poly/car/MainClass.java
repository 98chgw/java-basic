package oop.poly.car;

import oop.obj_arr.Person;

import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        porsche p1 = new porsche();
        porsche p2 = new porsche();
        porsche p3 = new porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

//        s1.run();s2.run(); s3.run(); p1.run(); p2.run(); p3.run();
//        t1.run(); t2.run(); t3.run(); t4.run();

//        Sonata[] sonatas = {s1, s2 , s3};
//        for (Sonata s : sonatas) {
//            s.run();
//        }

        Car[] cars = {s1, s2, s3, p1, p2, p3, t1, t2, t3, t4};
        for (Car c : cars) {  //iter
            c.run();
            //다행성을 저용해서 서로 다른 타입들을 모아놓을 수 있다.
        }
    }
}
