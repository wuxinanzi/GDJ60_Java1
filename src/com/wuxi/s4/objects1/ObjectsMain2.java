package com.wuxi.s4.objects1;

public class ObjectsMain2 {

	public static void main(String[] args) {
		//객체 생성
		int n = 10;
		Sword s1 = new Sword();
		s1.name = "집행검";
		s1.damage =50;
		s1.level = 3;
		s1.life  = 500;
		s1.price = 10000;
		
		Knight knight = new Knight();
		knight.name = "wu_xi nan_zi";
		knight.HP = 100;
		knight.mp = 100;
		knight.str = 15;
		knight.dex = 10;
		knight.inT = 5;
	
		knight.sword = s1;
		
		System.out.println(knight.sword.name);
		
		//변수 선언
		//데이터 타입 Sword  변수명 s2(지역 변수)
		Sword s2=null;   //reference =
		
		System.out.println(s2.damage);

	}

	

}
