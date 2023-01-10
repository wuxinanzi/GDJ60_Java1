package com.wuxi.s4.objects5.characters;

public abstract class Magition extends Character{
	
	
	private int mp;
	
	public Magition() {
		super("sdf");
	
		System.out.println();
	}
	
	public void attack() {                     
		System.out.println("마법공격");
	}
	
	

	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public abstract void spell();
	
}
