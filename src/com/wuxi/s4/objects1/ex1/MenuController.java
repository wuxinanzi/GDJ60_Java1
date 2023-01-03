package com.wuxi.s4.objects1.ex1;

import java.util.Scanner;

public class MenuController {
	
	
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check=true;
		StudentInput si = new StudentInput();
		StudentView sv = new StudentView();
		
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		Student [] students = new Student[count];
		
		
		while(check) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.수정");
			System.out.println("3.학생 전체 정보 출력");
			System.out.println("4.학생 추가");
			System.out.println("5.종료");
			int select=sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("등록입니다");
				si.setAllStudents(students);
				break;
			case 2:
				System.out.println("수정입니다.");
				break;
			case 3:
				sv.viewList(students);
				break;
			case 4:
				students = si.setStudent(students);
				System.out.println("학생추가:");
				break;
			default:
				System.out.println("종료합니다");
				check=false;
				break;
			}
			
		}
		
		
		
	}

	
		
}

