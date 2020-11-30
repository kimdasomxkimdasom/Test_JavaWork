package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		//추상클래스는 단독으로 객체 생성 불가! 
		//Weapon w1=new Weapon();
		//w1.prepare();
		//w1.attack();
		
		Weapon w2=new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
