package com.zeun;

import com.zeun.object.Musician;

public class MemberRepository {

    private final static Musician[] bandMembers;
    static boolean isBandCreated = false;
    private static int count;

    static {
        bandMembers = new Musician[5];
    }

    public static boolean createBand() {
        if (isBandCreated) {
            return false;
        } else {
            isBandCreated = true;
            return true;
        }
    }

    public static boolean store(Musician newMusician) {

        bandMembers[count++] = newMusician;
        return true;
    }

    public static Musician[] findAllMembers() {

        return bandMembers;
    }
}
