package oop.this_super.good;

public class Mage extends Player {

    int mana;

    public Mage(String name) {
        super(name);
        this.mana = 100;
    }

    @Override
    void characterInfo() {
        super.characterInfo();
        System.out.println("#마나: " + mana);
    }
}