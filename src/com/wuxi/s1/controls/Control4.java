package com.wuxi.s1.controls;

public class Control4 {

	public static void main(String[] args) {
		//다중 선택
		//switch case 정수식 또는 문자열 (상수형)
		int num = 1;
		System.out.println("1. 햄버거");
		System.out.println("2. 샌드위치");
		System.out.println("3. 샐러드");
		
		String select ="3";
		
		switch(select) {
		case "1":
			System.out.println("3번 선택");
			break;
		default:
			System.out.println("그외 나머지");
			break;
		case "3":
			System.out.println("1번 선택");
			break;
		case "2":
			System.out.println("2번 선택");
			break;
		
		
			
		}
		
	}

}
