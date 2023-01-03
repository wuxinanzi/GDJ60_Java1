package com.wuxi.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		
		int id2 = 0;
		int pw2 = 0;
		int salary = 0;
		int job = 0;
		double tax1 = 0.0; 
		double tax2 = 0.0;
		double tax3 = 0.0; 
		double tax4 = 0.0; 
  		System.out.println("ID를 입력하세요:");
		id2 = sc.nextInt();
		System.out.println("PW를 입력하세요:");
		pw2 = sc.nextInt();
		
		
		
		if(id == id2 && pw == pw2) {
			System.out.println("로그인 되었습니다.");
			
		}else {
			System.out.println("로그인 실패했습니다.");
		}
		
		if(id == id2 && pw == pw2) {
			System.out.println("급여를 입력하세요:");
			salary = sc.nextInt();
		    System.out.println("정규직이면 1,비정규직이면 2를 입력하세요");
		    job = sc.nextInt();
		    if(job == 1) {
		    	tax1 = salary*0.02; //고용보험
		    	tax2 = salary*0.03; //의료보험
		    	tax3 = salary*0.01; //국민연금
		    	tax4 = salary*0.01; //산재보험
		    	
		    	System.out.println(salary-(tax1+tax2+tax3+tax4) +"원 실급여");
		    	
		    }else {
		    	System.out.println(salary-(salary*0.033)+"원 실급여");
		    }
		    sc.close(); 
		    
		}
		  
   }
		//로그인이 성공했을때만 실행
		//급여를 입력 
		//정규직이면 1을 , 계약직이면 2를 입력
		//실급여 계산
		//정규직: 고용보험 2%,의료보험 3%,국민엽금 1%, 산재보험 1%
		//계약직: 원천징수 3.3%
		//실급여 출력
}


