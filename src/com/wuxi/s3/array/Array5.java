package com.wuxi.s3.array;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int [] ar1 = {1,2,3};
				//새로운 배열 생성
				//깊은 복사
				int [] copy = new int[ar1.length-1];
				
				for(int i=0;i<copy.length;i++) {
					copy[i] = ar1[i];
				}
				ar1 = copy;
				for(int i=0;i<ar1.length;i++) {
					System.out.println(ar1[i]);
				}
	}

}
