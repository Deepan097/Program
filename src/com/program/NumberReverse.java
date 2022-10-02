package com.program;

public class NumberReverse {
public static void main(String[] args) {
    int l=12345678;
    int reverse =0;
    for ( ;l != 0; l=l/10) {
    	int remainder = l % 10;  
//    	System.out.println(remainder);
    	reverse = reverse * 10 + remainder; 
	}
   System.out.println(reverse);
}
}
