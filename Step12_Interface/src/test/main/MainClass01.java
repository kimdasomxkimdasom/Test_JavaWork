package test.main;

import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		//단독 객체 생성 불가
		Remocon r1=null;
		//Remocon 인터페이스에 정의된 메소드 호출하기
		r1.up();
		r1.down();
		//Remocon 인터페이스에 정의된 static final상수 참조하기
		System.out.println(Remocon.COMPANY);
		//Remocon.COMPANY="삼성";
		//수정불가(오류) : final 필드므로 수정불가 (읽기전용)
	}
}
