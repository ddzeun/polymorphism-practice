package com.zeun;

public class Vocalist extends Musician implements Singable{

    public Vocalist(String name) {
        super(name, "Vocal");
    }

    @Override
    public void perform() {
        sing();
    }

    @Override
    public void sing() {
        System.out.println("독창적인 " + getPart() + "로 열창중인 " + getName() + "🎤🎤");
    }
}
