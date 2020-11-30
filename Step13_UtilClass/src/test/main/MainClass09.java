package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass09 {
	/*
	 * HashSet클래스는 Set 인터페이스를 구현한 클래스 이다.
	 * -저장된 데이터를 순서없이 무작위로 관리한다.
	 * -
	 * -
	 */
	public static void main(String[] args) {
		//정수 값을 저장할 수 있는 HashSet객체 
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		
		//어떤 data가 Set에 있는지 여부를 리턴하는 메소드
		boolean result1=set1.contains(10); //true
		boolean result2=set1.contains(50); //false
		//Set이 비어있는지 여부를 리턴
		boolean result3=set1.isEmpty(); //false
		//저장된 아이템 갯수 
		int size=set1.size(); //3
		
		//정수가 일렬로 담겨진 Iterator객체의 참조값 얻어내기
		Iterator<Integer> it=set1.iterator();
		//커서 다음에 데이터가 있으면
		//false가 될때까지 반복한다. 
		while(it.hasNext()) {
			//커서를 다음 데이터로 옮겨서 해당 데이터를 읽어낸다.
			Integer tmp=it.next();
			//읽어낸 데이터 콘솔에 출력하기.
			
			System.out.println(tmp);
		}
	}
}
