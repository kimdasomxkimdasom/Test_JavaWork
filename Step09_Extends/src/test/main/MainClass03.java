package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone객체를 생성해서 참조값을 부모type지역변수에 대입
		Object p1=new HandPhone();
		
		//p1과 p2를 같은 참조값으로 하고싶다(같은 id값으로 만들고 싶을 때)
		//Phone p2=p1; 는 오류가 난다
		//강제로 캐스팅을 해버린다
		
		// => 대입연산자의 우측을 Phone type으로 
		//casting(변환)해서 p1안에 있는 참조값을
		//Phone type변수 p2에 대입하기
		Phone p2=(Phone)p1;
		p2.call();
		
		HandPhone p3=(HandPhone)p1;
		p3.mobileCall();
		p3.takePicture();
	}
}
