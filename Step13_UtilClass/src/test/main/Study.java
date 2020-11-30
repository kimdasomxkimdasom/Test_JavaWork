package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Market;

public class Study {
	public static void main(String[] args) {
		List<Market> foods=new ArrayList<>();
		
		Market f1=new Market("사과");
		Market f2=new Market("우유");
		Market f3=new Market("치즈");
		
		foods.add(f1);
		foods.add(f2);
		foods.add(f3);
		
		for(Market tmp:foods) {
			tmp.bought();
		}
			
	}
}
