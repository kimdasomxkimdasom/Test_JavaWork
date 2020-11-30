package test.auto;

public class Car {
	//protected 접근 지정자를 가진 필드
	//패키지가 달라도 나를 상속하면 보여주겠다
	protected Engine engine;
	
	//Engine type을 인자로 전달 받는 생성자
	public Car(Engine engine) {
		this.engine=engine;
	} //위에를 만들었기 때문에 디폴트 생성자가 사라진다. 
	  //new Car(); X 
	  //new Car(new Engine()); O
	
	//메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine이 없어서 달릴 수 가 없어요");
			return; //메소드 끝내기
		}
		System.out.println("달려요!");
	}
}
