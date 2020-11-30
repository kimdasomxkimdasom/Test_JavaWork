package today.test;

public class test02 {
	public static void main(String[] args) {
		//조건문 공부
		
		char ch='a';
		if (ch >= 'a' && ch <= 'z') {
		    System.out.println("해당 문자는 영문 소문자입니다.");
		}
		
		char ch2='A';
		if (ch2 >= 'a' && ch2 <= 'z') {
		    System.out.println("해당 문자는 소문자 입니다.");
		}else {
			System.out.println("해당 문자는 소문자가 아닙니다.");
		}
		
		char ch3='ㅎ';
		if (ch3 >= 'a' && ch3 <= 'z') {
		    System.out.println("해당 문자는 영문 소문자입니다.");
		} else if (ch3 >= 'A' && ch3 <= 'Z') {
		    System.out.println("해당 문자는 영문 대문자입니다.");
		} else {
		    System.out.println("해당 문자는 영문자가 아닙니다.");
		}
		
	}
}
