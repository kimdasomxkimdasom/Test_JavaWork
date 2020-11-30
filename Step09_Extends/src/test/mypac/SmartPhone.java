package test.mypac;

//SmartPhone 클래스를 종단 클래스로 만드는 final 예약어
public class SmartPhone extends HandPhone{
	
	//디폴트생성자
	public SmartPhone() {
		System.out.println("SmartPhone()생성자가 호출됨");
	}
	
	//인터넷을 하는 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}

	// @Override --> 재정의 (덮어 씌우기 개념) 
	// 이 메소드는 재정의한 메소드라고 표시해주는 어노테이션(@)
	// 특별한 기능을 하는것은 아니고 단지 재정의한 메소드라고 표시해주는 기능
	public void takePicture() {
		// super는 부모객체를 가르키는 예약어이다.
		// 피 오버라이드된 부모 메소드도 만일 호출하려면
		// 아래와 같이 호출하면 된다.
		// super.takePicture();
		// 부모메소드를 호출해야 하는지 아닌지는 그때 그때 클래스에 따라 다르므로
		// 클래스 사용법을 학습을 해서 선택을 해야 한다. 
		System.out.println("1000만 화소의 사진을 찍어요!");
		
	}	
}
