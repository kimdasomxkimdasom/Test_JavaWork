package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍 3개를 뚫어요");
			}
		});
		
		//메소드가 하나일때만 사용이 가능 
		//화살표 함수 
		useDrill(()->{
			System.out.println("천장에 구멍을 2개 뚫어요");
		});
		
		Drill d1=()->{
			System.out.println("벽에 구멍을 4개 뚫어요");
		};
		useDrill(d1);
	}
	
	public static void useDrill(Drill d) {
		d.hole();
	}
}
