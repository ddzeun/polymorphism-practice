package com.zeun.object;

// 추상 클래스 Musician
public abstract class Musician {

    private String name;
    private String part;

    public Musician() {}

    public Musician(String name, String part) {
        this.name = name;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public void checkStatus() {
        System.out.println(getName() + "이" + getPart() + "로 참여중입니다.");
    }

    // 추상 메소드 perform, 연주는 하지만 각자의 역할에 따라 어떤 연주인지 달라짐
    public abstract void perform();
}
