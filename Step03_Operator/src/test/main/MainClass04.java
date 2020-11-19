package test.main;
/*
 * 4. 논리 연산자
 * 
 * - 논리값boolean을 연산할때 사용하는 연산자 이다.
 * ||, &&, !
 * and, or, not
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// or 연산 ; 둘중 하나만 true면 true
		boolean result1 = false || false; //false
		boolean result2 = false || true; //true
		boolean result3 = true || false; //true
		boolean result4 = true || true; //true
		// and 연산
		boolean result5 = false && false; //false
		boolean result6 = false && true; //false
		boolean result7 = true && false; //false
		boolean result8 = true && true; //true
		// not 연산
		boolean result9 = !true; //false
		boolean result19 = !false; //true
		
		boolean isRun=false;
		//만일 isRun이 true가 아니라면 
		if(isRun != true){
			System.out.println("달리지 않아요");
		}
		//만일 달리지 않을거라면 
		if(!isRun){
			System.out.println("달리지 않아요2");
		//둘다 같은 로직임. 코드풀이만 다를뿐.
		}
	}
}
