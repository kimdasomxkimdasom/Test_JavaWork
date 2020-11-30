package test.main;

import test.mypac.Phone;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("main메소드가 시작되었습니다.");
		
		Phone p1=null;
		Phone p2=new Phone();
		
		MainClass08.usePhone(p1);
		MainClass08.usePhone(p2);
		
		System.out.println("main메소드가 종료되었습니다.");
	}
	
	public static void usePhone(Phone p) {
		//여기에서 NullPointException을 방지하는 방법이 있을까요?
		if(p!=null) {
			p.call();
		}
	}
}
