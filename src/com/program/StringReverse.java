package com.program;

public class StringReverse {

	public static void main(String[] args) {
		String b = "";
		String a = "This is my world";

		// 1 st method with for
//		for (int i = a.length() - 1; i >= 0; i--) {
//			a.charAt(i);
//			b = b + a.charAt(i);
//		}
//		System.out.println();
//		System.out.println(b);
		
		
		
		// 2 nd method with for
		System.out.println("*******2nd method ******");
		char ch;
		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			b = ch + b;
		}
//		System.out.println();
		System.out.println(b);

		
		
		
		
		// 3.inbuilt method
		System.out.println("*******3rd method ******");
		StringBuilder s = new StringBuilder();
		StringBuilder append = s.append(a);
		StringBuilder reverse = append.reverse();
		System.out.println(reverse);
		
		
		
		
		
		// 4.inbuilt method
		System.out.println("*******4th  method ******");
		StringBuffer f = new StringBuffer();
		StringBuffer append2 = f.append(a);
		StringBuffer reverse2 = append2.reverse();
		System.out.println(reverse2);

	}
}
//
// if(a.toLowerCase().equals(b.toLowerCase())){
// System.out.println("Equal");
// }
// else {
// System.out.println("Not Equal");
// }