package com.wuxi.s1.controls;

import java.util.Scanner;

public class Control2_ex1 {
	public static void main(String[] args) {
		//회원가입 할 때 입력한 ID, PW
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		int id2 = 0;
		int pw2 = 0;
		System.out.println("ID를 입력하세요:");
		id2 = sc.nextInt();
		System.out.println("PW를 입력하세요:");
		pw2 = sc.nextInt();
		
		if(id == id2 && pw == pw2) {
			System.out.println("로그인 되었습니다.");
			
		}else {
			System.out.println("로그인 실패했습니다.");
		}
		sc.close();
		//키보드로 부터 id, pw를 입력 받아서 로그인 처리
	}

}
