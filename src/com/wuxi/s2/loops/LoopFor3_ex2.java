package com.wuxi.s2.loops;

import java.util.Scanner;

public class LoopFor3_ex2 {
    
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in); 
	   
		//배그
		//총알 30발 -> 1탄창
	   //캐릭터당 총  -> 3탄창
	   
	   //1.단발 2.점사
	   //1번이면 "탕" 30번 반복 출력
	   //2번이면 "타타탕" 10번 반복 출력
	   
//	   System.out.println("1.단발 2.점사 중 선택하시오:");
//	  
//	   
//	   for(int a=1;a<=3;a++) {
//		   
//	   int dan = sc.nextInt();
//		 
//	   
//	   if(dan == 1) {
//		   System.out.println("단발을 선택하셨습니다.");
//		   for(dan = 1; dan<=30; dan++) {
//			   System.out.print(dan+ "탕 ");
//			}  
//	   }else {
//		   System.out.println("점사를 선택하셨습니다.");
//           for(int i=1; i<=10; i++) {
//			   System.out.print(i+ "타타탕 ");
//	   
//	     }
//          
//	   }
//	   
//	 }
//	  
	   for(int t=1;t<4;t++) {
		   
		   System.out.println("1단발  , 2점사");
		   int select = sc.nextInt();
		   System.out.println(select);
		   int count=10;
		   String sound="타타탕";
		   
		   if(select==1) {
			   sound = "탕";
			   count = 30;
		   }
		   
			   for(int b=0;b<=count;b++) {
				   System.out.println(b + "번째 소리" + sound);
			   }
			  
		   System.out.println("탄창 소비");
	   }
      }
    }
	   

	
	
  
