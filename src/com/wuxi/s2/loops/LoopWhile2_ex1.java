package com.wuxi.s2.loops;

import java.util.Scanner;

public class LoopWhile2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id =1234;
		int pw =5678;
		boolean check = true;
		
		while(check) {
			System.out.println("ID를 입력하세요:");
			int ID = sc.nextInt();
			
			System.out.println("PW를 입력하세요:");
			int PW = sc.nextInt();
			
			if(id == ID && pw == PW ) {
				System.out.println("로그인 성공하셨습니다.");
				System.out.println("로그인 성공으로 게임에 접속하셨습니다.");
				
				int level = 1;
				int gold = 0;
				int ex = 0;
				
				System.out.println("현재 레벨:" + level+" 현재 골드:" + gold+"현재 경험치:" + ex);
				
				for(level=1;level<=15;level++) {
					for(ex=3;ex<52;ex=ex+3) {
						
						System.out.println("레벨업: " + level+" 현재 골드:" + gold+"현재 경험치:" + ex);
					}
					 	
					if(level == 5) {
						gold = gold + 1000;
						System.out.println("현재골드: " +gold);
					}else if(level == 10) {
						gold = gold + 2000;
						System.out.println("현재골드: " +gold);
					}else if(level == 15) {
						gold = gold + 3000;
						System.out.println("현재골드: " + gold);
					}
					
						
				} check = false;
				
			}else {
				System.out.println("로그인 실패하셨습니다. 로그인 성공 할때 까지 시도 하십시오.");
			}
			
		  
				//----------------------------- 게임 진행 파트 -----------------------
				//1.로그인 성공 했을 때 진행
				//레벨은 1로 시작
				//GOLD는 0
				//5렙 달성시 1000GOLD지급
				//10렙 달성시 2000GOLD지급
				//15렙 달성시 3000GOLD지급
				//모든 몬스터의 경험치는 동일
				//1 -> 2 : 3
				//2 -> 3 : 6
				//3 -> 4 : 9
				//4 -> 5 : 12
				//.....
				//14 -> 15:52	
				//만렙 달성 축하, 현재 골드 출력
				
			
			} System.out.println("만렙을 축하드립니다 게임 종료 하겠습니다.");
			
		}
		
}	
	

