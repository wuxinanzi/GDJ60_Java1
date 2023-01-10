package com.wuxi.s4.objects5.characters;

public class Archer extends Character implements AttackAble {
	
		//private String name

		
		private int dex;
		
		public Archer() {
			super("");
		}
		@Override //수정의 의미
		public abstract void attack() {
			System.out.println("공격");
		}
		
		
		
	
		public void move() {
			System.out.println("이동~");
		}
		
		
		
		public int getDex() {
			return dex;
		}
		public void setDex(int dex) {
			this.dex = dex;
		}
		
}
