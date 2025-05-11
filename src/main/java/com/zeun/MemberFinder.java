package com.zeun;

import com.zeun.object.Musician;

public class MemberFinder {

    public Musician[] findAllMembers() {

        return MemberRepository.findAllMembers();
    }
}
