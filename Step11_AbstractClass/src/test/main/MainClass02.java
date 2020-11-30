package test.main;

import test.mypac.Missile;
import test.mypac.Weapon;
	/*
	 * 여러분이 직접 Weapon추상클래스를 상속 받은 클래스를
	 * 정의해서 객체 생성을 하고 해당 참조값을 이용해서
	 * 아래의 useWeapon메소드를 호출해보세요.
	 * (단,클래스 명은 MyWeapon말고 다른걸로)
	 */
public class MainClass02 {
	public static void main(String[] args) {
		Weapon m1=new Missile();
		useWeapon(m1);
		//useWeapon(Weapon w)를 참조 하려고 하는데 static메소드이다.
		//MainClass02.useWeapon(m1); 방식으로 참조를 한다.
		//하지만 동일한 클래스이기 때문에 MainClass02를 생략 할 수 있다. 
	}
	//Weapon type의 참조값을 인자로 전달 받는 메소드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
