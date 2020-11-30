package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		
		//1.
		List<Car> cars=new ArrayList<Car>(); //배열 만들기
		//2.
		Car c1=new Car("소나타"); //객체 생성하기
		Car c2=new Car("아반떼");
		Car c3=new Car("그랜저");
		cars.add(c1); //생성한 객체를 cars에 담기
		cars.add(c2);
		cars.add(c3);
		//3.
		for(int i=0; i<3; i++) { //반복문 돌리면서 메소드 호출하기 
			Car tmp=cars.get(i);
			tmp.drive();
		}	
		for(Car tmp:cars) { //확장 for문을 사용하면
			tmp.drive();
		}	
	}
}
