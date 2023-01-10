package com.wuxi.s4.objects3.p2;

import com.wuxi.s4.objects3.p1.Secret;

public class SecretMain {

	public static void main(String[] args) {
		 //static -> 그외 지정자
		/*클래스*/Secret secret = new Secret();/*디폴트*/
		       com.wuxi.s4.objects3.p2.Secret secret2 = new com.wuxi.s4.objects3.p2.Secret();
 		      
		       secret.money=1;
		       
		  secret.s1();
		//secret.s2();
		
		//System.out.println(secret.money);
		System.out.println(secret.point);
		Test test = new Test();
		System.out.println(test.point);
	}

}
