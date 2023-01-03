package com.wuxi.s3.array;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		
		int [] ar = {9,5,8,3,6};
		
		System.out.println("숫자가 큰 순서대로 정렬하시오:");
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i] + "");
		}
		System.out.println();
	
		Arrays.sort(ar,Comparator,reverseOrder());
		
		}
	}


