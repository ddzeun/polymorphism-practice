package com.zeun;

import java.util.Scanner;

public class BandMenu {

    Scanner sc = new Scanner(System.in);
    BandService bandService = new BandService();

    public BandMenu() {}

    public void menu() {

        while (true) {
            System.out.println("========= 할 일을 선택해주세요 =========");
            System.out.println("1. 밴드 만들기");
            System.out.println("2. 멤버 확인하기");
            System.out.println("3. 멤버 추가하기");
            System.out.println("4. 밴드 연주하기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("선택할 번호: ");

            int select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1:
                    bandService.makeBand();
                    break;
                case 2:
                    bandService.showAllMembers();
                    break;
                case 3:
                    bandService.addMember();
                    break;
                case 4:
                    bandService.performBand();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");
            }
        }
    }
}
