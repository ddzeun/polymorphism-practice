package com.zeun.object;

import com.zeun.interfaces.Playable;

public class Keyboardist extends Musician implements Playable {

    public Keyboardist(String name) {
        super(name, "Keyboard");
    }

    @Override
    public void perform() {
        playInstrument();
    }

    @Override
    public void playInstrument() {
        System.out.println(getPart() + "위에서 날아다니는 " + getName() + "🎹");
    }

}
