package com.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateSet {
	  public static void main(String[] args) {
		
	
	   String s="deepaen";
	   Set<Character> s1=new LinkedHashSet();
	   for(int i=0;i<s.length();i++)
	  s1.add(s.charAt(i));
	   System.out.print(s1);
	  }   
}