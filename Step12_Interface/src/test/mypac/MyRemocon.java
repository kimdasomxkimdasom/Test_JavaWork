package test.mypac;

public class MyRemocon implements Remocon{
					//interface는 implements
	@Override
	public void up() {
		System.out.println("볼륨을 높혀요");
	}

	@Override
	public void down() {
		System.out.println("볼륨을 낮춰요");
	}
					
}
