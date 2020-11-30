package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			@Override
			public void up() {
				System.out.println("볼륨을 올려요");
			}
			@Override
			public void down() {
				System.out.println("볼륨을 내려요");
			}
		};
		//r1 지역변수에 담긴값을 3번 사용해보기
		//변수에 담아서 여러번 사용 하고 싶으면 위에처럼
		useRemocon(r1);
		useRemocon(r1);
		useRemocon(r1);
		
		//Remocon type의 참조값을 한번만(일회성)으로 사용하기
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("올려줘");
			}
			@Override
			public void down() {
				System.out.println("내려줘");
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
