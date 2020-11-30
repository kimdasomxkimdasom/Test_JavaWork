package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	
	static class AirconRemocon implements Remocon{ //아래와는 다른 방법
		@Override
		public void up() {
			System.out.println("온도를 높혀요");	
		}
		@Override
		public void down() {
			System.out.println("온도를 낮춰요");
		} 
	}

	public static void main(String[] args) {
		//Remocon 인터페이스를 구현한 Local Inner Class
		class TvRemocon implements Remocon{ //2번 + Override 
			@Override
			public void up() {
				System.out.println("채널을 올려요");
			}
			@Override
			public void down() {
				System.out.println("채널을 내려요");
			}
		}
		
		//Local Inner Class를 이용해서 객체를 생성
		Remocon r1=new TvRemocon(); //3번 
		useRemocon(r1);
		//Inner Class를 이용해서 객체를 생성
		Remocon a1=new AirconRemocon();
		useRemocon(a1);
		
		//위의 친구들을 실행하려면 main메소드에 넣어줘야함 
	}
	
	public static void useRemocon(Remocon r) { //1번 
		r.up();
		r.down();
	}
}
