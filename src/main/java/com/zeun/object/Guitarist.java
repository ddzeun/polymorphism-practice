package com.zeun.object;

import com.zeun.interfaces.Playable;
import com.zeun.interfaces.Singable;

public class Guitarist extends Musician implements Playable, Singable {

    private int numberOfLines;

    public Guitarist(String name, int numberOfLines) {
        super(name, "Guitar");
        this.numberOfLines = numberOfLines;
    }

    @Override
    public void perform() {
        sing();
        playInstrument();
    }

    @Override
    public void playInstrument() {
        System.out.println("손가락이 보이지 않는 " + getName() + "의 " + numberOfLines + "줄 " + getPart() + "연주 🎸");
    }

    @Override
    public void sing() {
        System.out.println("멜로디를 뒷받침해주는 " + getName() + "의 애드리브 🎤");
    }

    public void breakLine() {
        System.out.println("열정적으로 연주한 나머지 "+ getName() +"의 기타 줄이 끊어졌다.");
    }
}
