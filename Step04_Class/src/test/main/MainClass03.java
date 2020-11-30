package test.main;

import test.mypac.MyUtil;

public class MainClass03 {
	public static void main(String[] args) {
		
		//heap영역이 아닌 static이기 때문에 new할 필요가 없고
		//static에 정의된 클래스 명 MyUtil로 참조 가능
		
		//MyUtil 클래스에 정의된 static 메소드 호출하기
		MyUtil.playMusic();
		
		//MyUtil 클래스에 정의된 static 필드 참조해서 값 대입하기
		MyUtil.owner="김구라";
	}
}
