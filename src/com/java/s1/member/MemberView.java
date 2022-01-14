package com.java.s1.member;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class MemberView {
	
	//문자열을 받아서 출력하는 메서드 - 삭제 성공, 실패 여부 출력
	public void view(boolean check) {
		if(check == true) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
	//한 사람의 정보를 출력하는 메서드
	//정보가 있으면 출력, 없으면 정보가 없음 출력
	public void view(MemberDTO memberDTO) {
		if(memberDTO != null) {
			System.out.println("이름 : " + memberDTO.getName());
			System.out.println("별명 : " + memberDTO.getNickname());
			System.out.println("이메일 : " + memberDTO.getEmail());
			System.out.println("폰번호 : " + memberDTO.getPhone());

			//2000년 12월 24일 (수) 
			Calendar ca = memberDTO.getBirth();
			String pattern = "yyyy년 MM월 dd일 (E)";
			SimpleDateFormat sd = new SimpleDateFormat(pattern);
			String result = sd.format(ca.getTime());
			
			System.out.println("생일 : " + result);			
			
		} else {
			System.out.println("정보가 없습니다");
		}
	}
	
	public void view(List<MemberDTO> ar) {
		
		for(int i = 0; i < ar.size(); i++) {
			MemberDTO memberDTO = ar.get(i);
			System.out.println("이름 : " + memberDTO.getName());
			System.out.println("별명 : " + memberDTO.getNickname());
			System.out.println("이메일 : " + memberDTO.getEmail());
			System.out.println("폰번호 : " + memberDTO.getPhone());
			//System.out.println("생일 : " + memberDTO.getBirth());
			
			Calendar ca = memberDTO.getBirth();
			String pattern = "yyyy년 MM월 dd일 (E)";
			SimpleDateFormat sd = new SimpleDateFormat(pattern);
			String result = sd.format(ca.getTime());
			
			System.out.println("생일 : " + result);
			System.out.println("===============");
		}
		
	}
}
