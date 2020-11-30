package test.main;

import test.war.Marine;
import test.war.Pentagon;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * [프로그래밍의 목적]
		 * 
		 * 1.사령부에서 전쟁을 선언하고
		 * 2.마린을 움직여서
		 * 3.마린으로 공격하고
		 * 4.사령부에서 전쟁을 종료함 
		 */
				
		//1.
		Pentagon.startWar(); //class명 의 도움받음
		
		//2. 3.
		Marine mar=new Marine();
		mar.move(); //객체의 참조값으로 도움을 받음 
		mar.attack();
		
		//4.
		Pentagon.endWar();
		
	}
}
