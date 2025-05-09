package com.zeun;

public class keyboardist extends Musician implements Playable{

    public keyboardist(String name) {
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
