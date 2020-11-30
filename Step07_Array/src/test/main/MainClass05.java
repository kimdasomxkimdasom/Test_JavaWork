package test.main;

import test.mypac.Car;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Car type을 담을 수 있는 방3개 짜리 배열객체를 생성한다음
		//참조값을 cars 라는 지역변수에 담아보세요.
		//내가 푼것 틀림 -> String[] cars=new String[3];
		Car[] cars=new Car[3];
		
		//2.cars 배열에 Car객체를 생성해서 순서대로 담아보세요.(총3개)
		cars[0]=new Car();
		cars[1]=new Car();
		cars[2]=new Car();
		
		//for문을 이용 했을때 
		for(int i=0; i<cars.length; i++) {
			cars[i]=new Car();
		}
		
		//3.cars배열에 저장된 Car객체의 참조값을 순서대로 참조해서 
		//.drive() 메소드를 호출해보세요.
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		
		//for문을 이용했을때 
		for(int i=0; i<cars.length; i++) {
			cars[i].drive();
		}
	}
}
