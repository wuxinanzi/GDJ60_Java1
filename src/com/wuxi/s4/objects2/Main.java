package com.wuxi.s4.objects2;

public class Main {

	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();
		
		
		returnTest.t1(); //메서드가 보이드 인거 호출만해라 이뜻임
		
		int num = returnTest.t2();
		
		System.out.println(num);
		
		int [] ar = returnTest.t3();

	}

}
