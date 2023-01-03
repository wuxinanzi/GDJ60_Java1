package com.wuxi.s2.loops;

import java.util.Scanner;

public class LoopFor_ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		//로그인 시도 총 5번 시도가능
		
		//반복문 종료 후
		//로그인이 성공 했으면 "환영합니다" 출력
		//로그인이 실패 했으면 "은행을 방문하세요" 출력
		System.out.println("ID를 입력하세요:");
		id = sc.nextInt();
		System.out.println("PW를 입력하세요:");
		pw = sc.nextInt();
		if(id == 1234 && pw == 5678) {
			System.out.println("로그인 성공했습니다.");
		}else {
			for(int i=0;i<6;i++)
				System.out.println("로그인 실패했습니다. 다시 시도해주세요.");
				System.out.println("력하세요:");
				id = sc.nextInt();
				System.out.println("PW를 입력하세요:");
				pw = sc.nextInt();
				
				
				
			}
			System.out.println("5번 이상 틀려서 종료합니다.");
			
		}		
	}


