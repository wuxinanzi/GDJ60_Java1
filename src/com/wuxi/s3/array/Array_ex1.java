package com.wuxi.s3.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		//1. 학생수 입력
		//2. 학생수 만큼 이름을 입력 ,iu, winter
		//3. 학생수 만큼 학생의 번호, 국어, 영어, 수합 입력
		//   iu 학생이 번호:
		//   iu 학생이 국어:
		//   iu 학생이 영어:
		//   iu 학생이 수학:
		//   총점 평균  계산
		
		//모든 학생의 정보 출력
		// 이름 번호 국어 영어 수학
		// iu 1   53 63 52 
		//...
		System.out.println("학생수를 입력하세요:");
		int  studentshu = sc.nextInt();
		int [] student = new int [studentshu];
		
		for(int i=0;i<student.length;i++) {
			System.out.println(i+1+"번 째 학생이름을 입력하세요");
			String strLine = scn.next();
			System.out.println(strLine);
		for(int j=0;j<student.length;j++) {	
			
		}
		
	}

}
