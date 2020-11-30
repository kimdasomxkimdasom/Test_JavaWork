package test.main;

import test.mypac.Member;

public class MainClass05 {
	/*
	 * 두명의 회원정보를 2개의 Member 객체를 생성해서 담아보세요.
	 */	
	public static void main(String[] args) {
		Member mem1=new Member();
			mem1.num=1;
			mem1.name="김구라";
			mem1.addr="노량진";
			
		Member mem2=new Member();
			mem2.num=2;
			mem2.name="해골";
			mem2.addr="역삼동";
			
		mem1.showInfo();
		mem2.showInfo();
	}
}
