package test.main;

import test.mypac.Car;
/*
 * 프로그래밍의 목적이"달려요"라면?
 * 목적을 달성해 보세요.
 */
public class MainCalss02 {
	public static void main(String[] args) {
		//Car 객체를 생성해서 참조값을 car1이라는 지역변수에 담기
		Car car1=new Car();
		//car1안에 들어있는 참조값에 점 찍어서 drive() 메소드 호출하기
		car1.drive();
		//car1안에 들어있는 참조값에 점 찍어서name이라는 필드에
		//Sting type참조값 넣어주기
		car1.name="프라이드";
		//car1 안에 들어있는 참조값에 점 찍어서 cc라는 필드에 
		//int type value 넣어주기 
		car1.cc=1000;
		
		Car car2=new Car();
		car2.drive();
		car2.name="소나타";
		car2.cc=2000;
		
	}
}