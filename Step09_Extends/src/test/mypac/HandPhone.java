package test.mypac;

public class HandPhone extends Phone {
	
	/*
	 * Object <--- Phone <--- HandPhone
	 *      (extends)  (extends)
	 * 
	 * new HandPhone(). 위에 관련된 메소드 다 사용 가능 
	 * new Phone(). 은 Object와 Phone 메소드만 사용 가능 
	 */
	
	//디폴트 생성자
	public HandPhone() {
		System.out.println("HandPhone()생성자 호출됨");
	}
	
	//이동중에 전화를 걸어요
	public void mobileCall() {
		System.out.println("이동중에 전화를 걸어요");
	}
	
	//사진을 찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}
}
