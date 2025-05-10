package com.zeun.object;

import com.zeun.interfaces.Playable;

public class Drummer extends Musician implements Playable {

    public Drummer(String name) {
        super(name, "Drum");
    }

    @Override
    public void perform() {
        playInstrument();
    }

    @Override
    public void playInstrument() {
        System.out.println(getName() + "의 화려한 " + getPart() + "솔로 연주 🥁");
    }
}
