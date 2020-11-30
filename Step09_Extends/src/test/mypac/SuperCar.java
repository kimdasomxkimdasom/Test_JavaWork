package test.mypac;

import test.auto.Car;
import test.auto.Engine;

//가정 test.auto패키지를 어디선가 다운을 받았고, 그것을 이용해서 코드를 짜려고 한다.
public class SuperCar extends Car{
			//상속을 받았는데 에러가 남
			//왜 에러가 났을까?
			//Car의 생성자를 확인해보면 Engine생성자도 필요하다
	
	//Engine type을 전달받는 생성자
	public SuperCar(Engine engine) {
		//부모 생성자에 필요한 값을 전달해 주는 문법
		super(engine); //super.은 부모를 참조하는것 
					   //super( )은 부모생성자를 호출하는 표현
	}
	/*
	 * 위에 왜 생성자 인가?
	 * 1.public class명이 같고
	 * 2.리턴타입이 없다
	 */
	
	//빨리 달리는 메소드
	public void driveFast() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴수가 없어요");
			return;//메소드 끝내기
		}
		System.out.println("엄청 빨리 달려요!");
	}
			
}
