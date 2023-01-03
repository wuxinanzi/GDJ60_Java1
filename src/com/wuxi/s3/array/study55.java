package com.wuxi.s3.array;

import java.util.Arrays;

public class study55 {

	public static void main(String[] args) {
		
		System.out.println("[버블정렬(bubble sort)-이중 for문을 사용해 내림차순(큰순서)데이터 정렬실시]");
		
		int [] ar = {9,5,8,3,6};
		System.out.println("원본:"+Arrays.toString(ar));
		
		int save = 0;
	
		for(int i = 1; i<=5; i++) {
			for(int k = 0;k<ar.length;i++) {
				if((k+1)<ar.length) {
					if(ar[k]<ar[k+1]) {
						save = ar[k];
						ar[k] = ar[k+1];
						ar[k+1]=save;
					}
				}
				
			}
			
			
		}
		

	}

}
