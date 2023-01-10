package com.wuxi.s4.objects3.p1;

public class Member {
	private String name;
	private int age;
	private double ki;
	private double muge;
    private boolean check;
    
	
	public Member() {}
	
	public Member(int age) {
		if(age>0 && age<200) {
			this.age = age;
		}
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	//setter 메서드
	//set + 변수명의 첫 글자를 대문자로 바꾼것 두단어이상 사용행서 뒤에 대문자
	public void setAge(int age) { //데이터 집어넣는건 set으로 시작
		this.age=age;
	}
	//getter 메서드
	//get++ 변수명의 첫글자를 대무자로 바꾼것 두단어이상 사용행서 뒤에 대문자
	public int getAge() { //데이터를 가져오는것 get으로 시작
		return this.age;
	}
	
	public void info() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}
