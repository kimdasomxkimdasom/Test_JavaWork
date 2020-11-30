package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//MemberDto 객체의 참조값을 담을 수 있는 ArrayList객체를 생성해서
		//ArrayList 객체의 참조값을 List type 지역변수 members에 담기
		List<MemberDto> members=new ArrayList<>();
		
		//3명의 회원정보를 members 배열에 담아보세요
		MemberDto dto1=new MemberDto(1,"김구라","노량진");
		members.add(dto1);
		MemberDto dto2=new MemberDto(2,"김다솜","송파동");
		members.add(dto2);

		MemberDto mem1=new MemberDto();
		mem1.setNum(3);
		mem1.setName("원숭이");
		mem1.setAddr("잠실역");
		members.add(mem1);
		
		members.add(new MemberDto(4,"덩어리","상도동"));
		
		/*
		 *  members 에 들어 있는 참조값을 이용해서 
		 *  반복문 돌면서 아래와 같은 형식으로 회원 정보를 출력해 보세요.
		 *  
		 *  번호는 1 이름은 김구라 주소는 노량진
		 *  번호는 2 이름은 해골 주소는 행신동
		 *  번호는 3 이름은 원숭이 주소는 상도동
		 */
		
					//i<4 보다는 아래 처럼
		for(int i=0; i<members.size(); i++) {
			String info="번호는 "+members.get(i).getNum()+
						" 이름은 "+members.get(i).getName()+
						" 주소는 "+members.get(i).getAddr();
			System.out.println(info);
			//members.get(i).getNum();
			//members.get(i).getName();
			//members.get(i).getAddr();
		}
		
		System.out.println("----------------------------");
		
		//tmp를 사용해서 해주는게 좋음 
		for(int i=0; i<members.size(); i++) {
			MemberDto tmp=members.get(i);
			String info="번호는 "+tmp.getNum()+
					" 이름은 "+tmp.getName()+
					" 주소는 "+tmp.getAddr();
			System.out.println(info);	
		}
		
		System.out.println("----------------------------");
		
		//반복문 위에2줄을 이렇게 줄여서 사용 가능 
		//확장 for문 [배열의 인덱스가 필요가 없을 때]
		for(MemberDto tmp:members) {
			//type    //member's Generic Type
			String info="번호는 "+tmp.getNum()+
					" 이름은 "+tmp.getName()+
					" 주소는 "+tmp.getAddr();
			System.out.println(info);	
		}

	}
}
