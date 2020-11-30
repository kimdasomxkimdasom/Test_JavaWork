package test.mypac;

//extends는 어떤 클래스를 상속 받을때 사용하는 예약어이다.

//어떤 클래스도 extends하지 않으면 자동으로 Object클래스를 상속받게된다.
//extends Object가 생략 되어있다.
//따라서 Object클래스를 상속받을거라면 생략이 가능하다.
//다른 클래스를 상속 받을 거 라면 extends 클래스명 입력 하면 된다. 

public class Phone extends Object{
	
	//디폴트 생성자 
	public Phone() {
		System.out.println("phone()생성자 추가됨");
	}
				
	//전화거는 non static 메소드
	public void call() {
		System.out.println("전화를 걸어요!");
	}

}
