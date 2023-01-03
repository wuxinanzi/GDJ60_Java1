package com.wuxi.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		//Game : TRPG
		//법사
		String name ="핫팩";
		int hp = 20;
		int mp = 20;
		
		
		
		String monsterName = "오크";
		int monsterHp = 10;
		
		System.out.println("1.hp 보충");
		System.out.println("2.mp 보충");
		System.out.println("3.마법1 ");
		System.out.println("4.마법2 ");
		System.out.println("5.턴넘기기");
		System.out.println("상황에 맞게 선택하여 플레이 하시오:");
		
		int select = sc.nextInt();
		
		if(select == 1) {
			int h = random.nextInt(25);
			hp = hp + h;//20 30 => 50
			if(hp>40) {
				hp = 40;
			}
			System.out.println("현재나의회복된 HP:" + hp);
				
		
		}else if(select == 2) {
			int m = random.nextInt(25);
			mp = mp + m;
			if(mp>40) {
				mp = 40;
			}
			System.out.println("현재나의회복된 MP:" + mp);
		}else if(select == 3) {
			
			System.out.println("받아라 파이어에로우");
			int magic1 = random.nextInt(6);
			monsterHp = monsterHp-magic1;
			mp = mp - 3;
			System.out.println("파이어에로우 데미지: " + magic1 + " 마법사용후 남은 MP량:" + mp);
			System.out.println("몬스터 체력: " + monsterHp);
					
			//주문을 외우기
			//mp 3씩 감소
			//0 ~5이하의 수치를 공격
			
		}else if(select == 4) {
			
			System.out.println("받아라 콜드빔");
			int magic2 = random.nextInt(11);
			monsterHp = monsterHp-magic2;
			if(magic2 >= 6) {
				System.out.println("이야~크리 떳다!!");
			}else {
				System.out.println("이게 크리가 안떠?");
			}
			mp = mp - 5;
			System.out.println("콜드빔 데미지: " + magic2 + " 마법사용후 남은 MP량:" + mp);
			System.out.println("몬스터 체력: " + monsterHp);
			
			//주문을 외우기
			//5씩 감소
			//0 ~10이하의 수치를 공격
		}else {
			System.out.println("턴을 넘깁니다");
			System.out.println("유저의 이름: " + name + " 유저의 HP: " + hp + " 유저의 MP: " + mp);
			System.out.println("몬스터의 이름: "+ monsterName + "  몬스터의 HP: "+ monsterHp);
		} 
		
		
		
		
		sc.close();
		//유저의 HP,MP
		//몬스터의 이름과 HP,MP
		
		
		/*System.out.println("1~5번 스킬 사용하세요:");
		int click1 = sc.nextInt();
		
		
		
		if(click1 == 1) {
			 test = random.nextInt(40);
			 hp = hp+test;
			 System.out.println("hp회복"+hp);
		}else if(click1 == 2) {
			
		}else if(click1 == 3) {
			System.out.println("마법1");
		}else if(click1 == 4) {
			System.out.println("마법2");
		}else{
			System.out.println("턴을 넘기기");
		 }*/
		
		//1. HP보충(포션) 2.MP(보충) 3.마법1 4.마법2 5.턴을 넘기기
		//HP는 최대 40이 끝
		//보충시 랜덤하게 0 ~ 40 사이의 숫자를 받아서 HP에 더하기
		
		/*int test = random.nextInt(5);// 0 ~ 5미만의 정수하나를 리턴
		int test2 = random.nextInt(30);// 0 ~ 30미만의 정수하나를 리턴
		System.out.println("test : " + test);
		System.out.println("test : " + test2);*/
		
	}

}
