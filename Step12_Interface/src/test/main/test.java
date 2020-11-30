package test.main;

import test.mypac.Remocon;

public class test {

	static class MusicRemocon implements Remocon{

		@Override
		public void up() {
			System.out.println("올려줘");
		}

		@Override
		public void down() {
			System.out.println("내려줘");
		}
	}
	
	public static void main(String[] args) {
		Remocon m1=new MusicRemocon();
		useRemocon(m1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
