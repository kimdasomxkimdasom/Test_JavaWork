package test.main;

import test.mypac.Calcultaor;

public class MainClass06 {
	public static void main(String[] args) {
		Calcultaor add=(double a,double b)->{
			return a+b;
		};
		//위를 간략하게 표현하면 아래와 같이 표현이 된다.
		Calcultaor add2=(a,b)->a+b;
		Calcultaor sub=(a,b)->a-b;
		Calcultaor multi=(a,b)->a*b;
		Calcultaor divide=(a,b)->a/b;
		
		useCalculator(add);
		useCalculator(add2);
		useCalculator(sub);
		useCalculator(multi);
		useCalculator(divide);
		
	}
	public static void useCalculator(Calcultaor cal) {
		double result=cal.exec(10, 20);
		System.out.println("result:"+result);
	}
}
