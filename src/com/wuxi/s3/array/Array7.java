package com.wuxi.s3.array;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {5,1,4};
		boolean check = true;
		
		
		//1번 누르면 데이터추가
		  //0번 인덱스에 추가
		//2번 누르면 데이터삭제
		  //0번 인덱스에 삭제
		//3번 누르면 종료
		while(check){
			System.out.println("1번을 누르면 데이터 추가:     "+"2번을 누르면 데이터 삭제:     "+"3번을 누르면 종료:     ");
			int select = sc.nextInt();
			
			if(select == 1) {
			System.out.println("0번 주소의 추가할 데이터 숫자를 입력하시오:");
			select = sc.nextInt();
			int [] copy = new int[ar.length+1];
			copy[0]=select;
			for(int i=0;i<ar.length;i++) {
				copy[i+1] = ar[i];
				
				
			}
			
			ar = copy;
			
		
			}else if(select == 2) {
			System.out.println("0번 주소의 데이터를 삭제합니다.");
				int [] copy = new int[ar.length-1];
				
				for(int i=0;i<copy.length;i++) {
					copy[i] = ar[i+1];
				}
			
				ar =copy;
			
			
			}else {
			System.out.println("종료 입니다.");
			break;
		 }
			for(int i=0;i<ar.length;i++) {
				System.out.println(ar[i]);
			}
		}
	}

}
