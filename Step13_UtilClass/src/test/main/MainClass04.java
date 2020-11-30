package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass04 {
	public static void main(String[] args) {
		//정수를 저장할 ArrayList 객체를 생성해서 참조값을 nums 라는 지역변수에 담아 보셈
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		//실수를 저장할 ArrayList 객체를 생성해서 참조값을 nums2 라는 지역변수에 담아 보셈
		ArrayList<Double> num2=new ArrayList<Double>();
		num2.add(1.1);
		num2.add(2.2);
		num2.add(3.3);
		
		//List를 이용해서 만든건데.. 왜 이렇게 만든건지 구글링 해봐야할듯
		List<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		List<Double> nums2=new ArrayList<>();
		nums2.add(10.1);
		nums2.add(10.2);
		nums2.add(10.3);
		
	}
}
