package com.zeun;

import com.zeun.object.*;

import java.util.Scanner;

public class MemberRegister {

    public void regist(String name, int position) {

        Musician newMember = null;
        switch (position) {
            case 1:
                newMember = new Vocalist(name);
                break;
            case 2:
                System.out.print("기타 줄 수를 입력하세요: ");
                Scanner sc = new Scanner(System.in);
                int numberOfLines = sc.nextInt();
                newMember = new Guitarist(name, numberOfLines);
                break;
            case 3:
                newMember = new Drummer(name);
                break;
            case 4:
                newMember = new Keyboardist(name);
                break;
            default:
                System.out.println("잘못된 포지션입니다.");
                return;
        }

        MemberRepository.store(newMember);
        System.out.println("멤버가 추가되었습니다!");

    }
}
