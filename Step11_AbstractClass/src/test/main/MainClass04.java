package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * Weapon 추상클래스를 상속 받은 익명의 local inner클래스를 이용해서
		 * Weapon type의 참조값을 얻어내서 
		 * w1이라는 Weapon type의 지역변수에 담기.
		 */
		
		//new Weapon(); <- 오류 : 추상클래스라서 단독으로 객체 생성이 불가하다.
		//오버라이드하기 
		Weapon w1=new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격해요! ! !");
			}
		};
		useWeapon(w1);
		useWeapon(w1);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
