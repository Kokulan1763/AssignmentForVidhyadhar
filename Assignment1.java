package com.cognizant;

public class Assignment1 {
	public static String DecryptString(String s) {
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1 - 4; i >= 0; i--) {
			ch[i] = 'X';
		}

		return String.valueOf(ch);

	}

	public static void main(String[] a) throws Exception {

		System.out.println(DecryptString("8889542543466"));
	}
}
