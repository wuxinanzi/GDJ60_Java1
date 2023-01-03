package com.wuxi.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		System.out.println("국어 점수를 입력하세요:");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		math = sc.nextInt();
		
		avg = (kor + eng + math)/3.0;
		total = kor + eng + math;
		boolean flag = true;
		if(avg>=60) {
			flag = true;
		}
		if(flag) {
		if(kor<40 || eng<40 || math<40) {
			flag = false;
		}else {
			flag = true;
		}
	   }
		if(flag) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		/*if(avg >= 60 && kor >= 40 && eng >=40 && math >= 40 ) {
			System.out.println("합격을 축하드립니다.");
			System.out.println("총점:" + total);
			System.out.println("평균:" + avg);
		}else {
			System.out.println("아쉽지만 불합격입니다.");
			System.out.println("총점:" + total);
			System.out.println("평균:" + avg);
		}*/
		
		sc.close();
		
		// 평균이 60점 이상인가??
		// 과목당 40점 이상인가??
		// 합격 불합격 출력
	
	}
}
