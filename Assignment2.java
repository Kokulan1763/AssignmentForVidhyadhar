package com.cognizant;

public class Assignment2 {
	public static StringBuilder DecryptStringBySB(StringBuilder s) {

		int length = s.length();
		for (int i = length - 5; i >= 0; i--)
			s.setCharAt(i, 'X');

		return s;

	}

	public static void main(String[] a) throws Exception {

		System.out.println(DecryptStringBySB(new StringBuilder("8889542543466")));
	}
}
