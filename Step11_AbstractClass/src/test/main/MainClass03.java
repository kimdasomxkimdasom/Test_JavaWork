package test.main;

import test.mypac.Missile;
import test.mypac.Weapon;

public class MainClass03 {
	//Inner Class
	//내부클래스 한해서 필요하다면 static예약어를 붙일 수 있다. (AirPlane을 참조해서 사용 가능)
	static class AirPlane extends Weapon{
		@Override
		public void attack() {
			System.out.println("공중에서 공격을 해요!");
		}	
	}
	
	public static void main(String[] args) {
		//Local Inner Class
		class Sword extends Weapon{
			@Override
			public void attack() {
				System.out.println("칼로 공격을 해요!");
			}
		}
		//Sword 객체를 생성해서 참조값을 Weapon type으로 받기
		Weapon w1=new Sword();//<-local inner class
		useWeapon(w1);
		//AirPlane객체를 생성해서 참조값을 Weapon type으로 받기
		Weapon w2=new AirPlane();//<-inner class
		useWeapon(w2);
		//Missile객체를 생성해서 참조값을 Weapon type으로 받기 
		Weapon w3=new Missile();//<-external class
		useWeapon(w3);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
