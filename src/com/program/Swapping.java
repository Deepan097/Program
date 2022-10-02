package com.program;

public class Swapping {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// a=a+b; // 30
		// b=a-b;//10
		// a=a-b;//20
		// System.out.println(a);System.out.println(b);
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);

	}

}