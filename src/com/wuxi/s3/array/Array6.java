package com.wuxi.s3.array;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {8,5,13,9,6};
		
		System.out.println("삭제할 숫자 입력:");
		int delete = sc.nextInt();		// 입력값 
		
		int[] copy = new int [ar.length-1];
		int idx = 0;
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]==delete) { //
				continue;
			}
			copy[idx] = ar[i];
			idx++;
			
		}
		ar = copy;
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		
		
		}
	}


