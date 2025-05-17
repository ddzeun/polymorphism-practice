package com.zeun;

import com.zeun.object.Musician;

import java.util.Scanner;

public class BandService {

    Scanner sc = new Scanner(System.in);
    MemberFinder finder = new MemberFinder();

    public void makeBand() {

        if (!isBandExisted()) {
            System.out.println("짝짝짝!! 밴드가 결성되었습니다!!!");
        } else {
            System.out.println("이미 밴드가 존재합니다.");
        }
    }

    public void showAllMembers() {

        if (isBandExisted()) {
            if (finder.findAllMembers()[0] == null) {
                System.out.println("아직 멤버가 없습니다. 새 멤버를 영입하세요!");
            } else {
                System.out.println("--------- 밴드 멤버 목록 ---------");
                for(Musician m: finder.findAllMembers()) {
                    if (m != null) {
                        m.checkStatus();
                    }
                }
            }
        } else {
            System.out.println("밴드가 존재하지 않습니다. 먼저 밴드를 결성하세요.");
        }
    }

    public void addMember() {

        MemberRegister memberRegister = new MemberRegister();

        if (isBandExisted()) {
            System.out.print("추가할 멤버의 이름을 입력하세요: ");
            String name = sc.next();

            System.out.println("해당 멤버의 포지션을 선택하세요.");
            System.out.println("1. 보컬\n2. 기타\n3. 드럼\n4. 키보드");
            int position = sc.nextInt();

            memberRegister.regist(name, position);
        } else {
            System.out.println("밴드가 존재하지 않습니다. 먼저 밴드를 결성하세요.");
        }
    }

    public void performBand() {

        if (finder.findAllMembers()[0] == null) {
            for (Musician member: MemberRepository.findAllMembers()) {
                if (member != null) {
                    member.perform();
                }
            }
        } else {
            System.out.println("밴드가 존재하지 않습니다. 먼저 밴드를 결성하세요.");
        }
    }

    private boolean isBandExisted() {

        return MemberRepository.isBandCreated;
    }
}
