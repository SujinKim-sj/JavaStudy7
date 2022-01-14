package com.java.s1.member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	
	public void select() {
		Scanner sc = new Scanner(System.in);
		MemberData memberData = new MemberData();
		ArrayList<MemberDTO> ar = new ArrayList<>();
		MemberView memberView = new MemberView();
		boolean check = true;
		
		while(check) {
			
			System.out.println("1. 전체 출력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 명단 추가");
			System.out.println("4. 명단 삭제");
			System.out.println("5. 종    료");
			
			int select = sc.nextInt();
			
			if(select == 1) {
				memberView.view(ar);
			} else if(select == 2) {
				MemberDTO memberDTO = memberData.searchMember(ar);
				memberView.view(memberDTO);
			} else if(select == 3) {
				MemberDTO memberDTO = memberData.addMember();
				ar.add(memberDTO);
			} else if(select == 4) {
				boolean removeCheck = memberData.removeMember(ar);
				memberView.view(removeCheck);
			} else {
				System.out.println("Finish");
				check = false;
			}
			
		}
		
	}
	
}
