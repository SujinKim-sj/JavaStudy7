package com.java.s1.member;

import java.util.ArrayList;
import java.util.HashMap;

public class MemberMain {

	public static void main(String[] args) {

		MemberMenu menu = new MemberMenu();
		
		menu.select();
		
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		map.put("a", ar);
		map.put("b", ar2);
		
	}

}
