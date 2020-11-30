package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Cat;
import test.mypac.Zoo.Monkey;//Zoo클래스의 내부클래스 Monkey import

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * Zoo클래스에 있는 getMonkey() 메소드를 호출해서
		 * 리턴되는 참조값을 m1 이라는 지역변수에 담아 보세요.
		 */
		
		//Monkey getMonkey()가 
		//non static메소드 이므로, 객체를 생성해야한다.
		//new를 하고, 참조 명, 참조타입을 입력.
		Zoo z1=new Zoo();
		Monkey m1=z1.getMonkey();
		m1.say();

		//고양이
		Cat c=new Zoo().getCat();
		c.say();
	}
}
