package com.wuxi.s4.objects5.characters;

public abstract class Character {
	
	private String name;
	private int hp;
	private int level;
	
	public Character(String name){
		this.name = name;
	}
	public  void attack() {
		System.out.println("공격 메서드");
		
	}
	public PotionSeller(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	

}
