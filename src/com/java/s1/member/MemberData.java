package com.java.s1.member;

import java.util.List;
import java.util.Scanner;

public class MemberData {
	private Scanner sc;
	
	public MemberData() {
		sc = new Scanner(System.in);;
	}
	
	//이름을 입력받아서 같은 이름이 있는 MemberDTO 의 인덱스 번호 찾기
	//찾아서 삭제
	//리턴 삭제여부 - 삭제 성공, 삭제 실패 
	public boolean removeMember(List<MemberDTO> ar) {
		System.out.println("삭제할 이름 입력");
		String removeName = sc.next();
		boolean check = false;
		MemberDTO memberDTO = null;
		
		for(int i = 0; i < ar.size(); i++) {
			if(removeName.equals(ar.get(i).getName())) {
				memberDTO = ar.get(i);
				//check = ar.remove(ar.get(i));
				//memberDTO = ar.remove(i);
				//check = "Success";
				break;
			}
		}
		
		return ar.remove(memberDTO);	//지워지면 true, 아니면 false 반환
		//return check;	
	}
		
	//이름을 입력받아서 같은 이름이 있는 MemberDTO 찾아서 리턴
	public MemberDTO searchMember(List<MemberDTO> ar) {
		System.out.println("찾고 싶은 멤버의 이름 입력");
		String searchName = sc.next();
		MemberDTO memberDTO = null;
		
		for(int i = 0; i < ar.size(); i++) {
			if(searchName.equals(ar.get(i).getName())) {
				memberDTO = ar.get(i);
				break;
			}
		}
		return memberDTO;
	}
	
	
	//3) 주소록 명단 추가
	public MemberDTO addMember() {
		MemberDTO memberDTO = new MemberDTO();
		
		System.out.println("이름 입력");
		memberDTO.setName(sc.next()); 
		System.out.println("별명 입력");
		memberDTO.setNickname(sc.next()); 
		System.out.println("이메일 입력");
		memberDTO.setEmail(sc.next()); 
		System.out.println("전화번호 입력");
		memberDTO.setPhone(sc.next()); 
		System.out.println("생일 입력");
		memberDTO.setBirth(sc.next()); 
		
		return memberDTO;
	}

}
