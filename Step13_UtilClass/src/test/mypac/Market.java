package test.mypac;

public class Market {
	
	private String name;
	
	public Market(String name){
		this.name=name;
	}

	public void bought() {
		System.out.println(this.name+" 을(를) 구매해요!");
	}
	
	
}
