package com.wuxi.s3.array;

import java.util.Scanner;

public class Arry_ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("학생 수를 입력하세요");
		int count = sc.nextInt();
		String [] names = new String[count];
		int[] nums = new int [names.length];
		int[] kor = new int [names.length];
		int[] eng = new int [names.length];
		int[] math = new int [names.length];
		int[] totals = new int [names.length];
		double[] avgs = new double [names.length];
		
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+" 번째 이름을 입력하세요");
			names[i] = sc.next();
			
		}
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" 학생의 번호를 입력하세요");
		    nums[i] = sc.nextInt();
		    System.out.println(names[i]+" 학생의 국어점수를 입력하세요");
		    kor[i] = sc.nextInt();
		    System.out.println(names[i]+" 학생의 영어점수를 입력하세요");
			eng[i] = sc.nextInt();
			System.out.println(names[i]+" 학생의 수학점수를 입력하세요");
			math[i] = sc.nextInt();
			totals[i]=kor[i]+eng[i]+math[i];
			avgs[i]=(kor[i]+eng[i]+math[i])/3;
		}
		System.out.println("이름 \t 번호 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" \t ");
			System.out.print(nums[i]+" \t ");
			System.out.print(kor[i]+" \t ");
			System.out.print(eng[i]+" \t ");
			System.out.print(math[i]+" \t ");
			System.out.print(totals[i]+" \t ");
			System.out.println(avgs[i]+" \t ");
		}
		
	
	}

}
