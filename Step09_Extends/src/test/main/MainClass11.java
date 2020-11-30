package test.main;

import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass11 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		/*
		 * 콘솔창을 확인해서 부모객체가 미리 만들어지는것을
		 * 확인 할 수가 있다.
		 */
		new SmartPhone();
		Object p1=new SmartPhone();
		Phone p2=new SmartPhone();
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
