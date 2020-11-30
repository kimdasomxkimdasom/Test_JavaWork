package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;
/*
 * 내가 키우는 자녀가 있다고 가정하자.
 * 자녀가 현재 사용하는 핸드폰이 인터넷이 안되는 구형 폰 이다.
 * 자녀가 인터넷을 하고싶어서 스마트폰을 갖고 싶다고 조른다.
 * 어떻게 할것인가?
 * 
 * 1.스마트폰을 새로 사준다(또는 만들어서 준다)
 * 
 * 2.스마트폰의 사용설명서만 가지고 와서 현재 폰의 설명서라고 우기고
 * 그냥 그 폰을 사용하라고 한다. 
 */
public class MainClass05 {
	public static void main(String[] args) {

		//MainClass03 캐스팅 이어서...
		
		Phone p1=new Phone();
		//runtime 시에 ClassCastException 이 발생한다.
		//위의 설명에서 2 번과 같은 경우이다.
		SmartPhone p2=(SmartPhone)p1;
		p2.doInternet();
		//실행을 하면 오류가 난다 (SmartPhone으로 캐스팅을 할 수 없다)
				
		
	}
}
