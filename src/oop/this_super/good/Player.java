package oop.this_super.good;

import java.lang.annotation.Target;

public class Player {

    String name;
    int level;
    int atk;
    int hp;

    Player() {
        System.out.println("Player의 기본 생성자 호출");
        level =1;
        atk = 3;
        hp = 50;
    }

    Player(String name) {
        this();
        System.out.println("Player의 2번 생성자 호출!");
        level = 1;
        atk =3;
        hp = 50;
        this.name =name;
    }

    Player(String name, int hp) {
        this(name); // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야 합니다.
        System.out.println("Player의 4번 생성자 호출");
        this.name = name;
        this.hp = hp;
    }

    void attack(Player target) {
//        System.out.println("때리는 애 = " + this);
//        System.out.println("맞는 애 = " + target);
        if(this==target) { //주소값
            System.out.println("스스로는 때릴 수 없습니다.");
            return;
        }
    //x가 y를 공격합니다.
        System.out.printf("%s가 %s를 공격합니다\n", this.name, target.name);
        //맞는 사람의 hp를 10 낮추고, 나의 체력을 5 회복하고 싶다.
        //결과를 출력해보자(나의 체력은 XX, 상대의 체력: XX)
        target.hp = target.hp - 10;
        this.hp += 5;
        System.out.printf("나의 체력: %d, 상대의체력: %d\n", this.hp, target.hp);

    }
    void characterInfo() {
        System.out.println("***캐릭터 정보***");
        System.out.println("#아이디: " + name);
        System.out.println("#레벨: " + level);
        System.out.println("#공격력: " + atk);
        System.out.println("#체력: " + hp);
    }
}
