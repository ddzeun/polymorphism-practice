package com.zeun;

public class Application {

    public static void main(String[] args) {

        Application application = new Application();
        Musician[] bandMember = {
                new Vocalist("수연"),
                new Guitarist("민선", 4),
                new Guitarist("유창", 6),
                new Drummer("지은"),
                new keyboardist("채원")
        };

        for(Musician member: bandMember){
            member.checkStatus();
            System.out.println();
        }

        for(Musician member: bandMember) {
            member.perform();
            System.out.println();

            if (member instanceof Guitarist) {
                ((Guitarist) member).breakLine();
                System.out.println();
            }
        }
    }

    public Musician getRandomMember(Musician[] musicians) {
        int random = (int) (Math.random() * 5);
        return musicians[random];
    }
}
