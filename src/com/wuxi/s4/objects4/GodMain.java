package com.wuxi.s4.objects4;

public class GodMain {

	public static void main(String[] args) {
		
		//singleTon 디자인패턴
		
		God god = God.getInstance();//클래스명.메서드명
		god.setName("유일신");
		
		System.out.println("God : "+god);
		System.out.println("Name : "+god.getName());
		
		god = God.getInstance();
		
		System.out.println("God : "+god);
		System.out.println("Name : "+god.getName());
		
		

	}

}
