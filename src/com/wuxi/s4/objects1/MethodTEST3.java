package com.wuxi.s4.objects1;

public class MethodTEST3 {
	
	public void t3(int salary, double tax) {//매개 변수
		//실급여를 계산하는 메서드
		salary = (int)(salary*tax);
		System.out.println("T3 :"+salary);
		
	}
	
	public void info(Sword sword) {
		System.out.println(sword.name);
		System.out.println(sword.damage);
		System.out.println(sword.life);
		System.out.println(sword.price);
		System.out.println(sword.level);
	}
	

}
