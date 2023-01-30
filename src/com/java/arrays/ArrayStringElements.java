package com.java.arrays;

import java.util.Map;
import java.util.TreeMap;

public class ArrayStringElements {
	public static void main(String args[]) {
		String s[] = new String[3];
		s[0] = "APARNA";
		s[1] = "ANUSHA";
		s[2] = "SHIREESHA";

		try {

			s[3] = "Gagan";
		} catch (Exception ex) {
			System.out.println(ex);
		}
		Map<Character, String> map = new TreeMap<>();
		map.put('A', "Aparna");
		map.put('N', "Anusha");
		map.put('S', "Shireesha");
		System.out.println(map);
		// for loop
		/*
		 * for(int i = 0;i<= 2;i++) { System.out.println(s[i]);
		 * 
		 * }
		 */
		// for ...each loop
		for (String i : s) {
			System.out.println(i);

		}
	}

}
