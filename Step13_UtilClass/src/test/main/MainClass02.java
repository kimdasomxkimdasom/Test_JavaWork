package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass02 {
	//한명의 회원 정보라고 가정하자
	public static void main(String[] args) {
		int num=1;
		String name="김구라";
		String addr="노량진";
		boolean isMan=true;
		
												       //< >Generic Class
		//동일한 회원정보를 HashMap 객체를 생성해서 담을수도 있다. //<K,V> Key값의 type, Value값의 type
		Map<String, Object> map1=new HashMap<String, Object>();
		//HashMap<String, Object> map1=new HashMap<>();이렇게 써도 됨 
		
		map1.put("num", num); //변수명 또는 직접 값을 넣을수 있다 map1.put("num", 1);
		map1.put("name", name); //map1.put("name", "김구라");
		map1.put("addr", addr);
		map1.put("isMan", true);

		//map1을 이용해서 "num"이라는 키 값으로 저장된 int불러오기
		int a=(int)map1.get("num");
		//"name"이라는 키값으로 저장된 String 불러오기
		String b=(String)map1.get("name");
		//"addr"이라는 키값으로 저장된 String 불러오기
		String c=(String)map1.get("addr");
		//"isMan"이라는 키값으로 저장된 boolean 불러오기
		boolean d=(boolean)map1.get("isMan");
		
		//저장된 아이템의 갯수 (4)
		int size=map1.size();
		
		//"addr"로 저장된 아이템 삭제하기
		map1.remove("addr");
		
		//모든 아이템 삭제하기
		map1.clear();
	}
}
