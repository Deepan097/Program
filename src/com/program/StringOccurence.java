package com.program;

public class StringOccurence {
	public static void main(String[] args) {
		String a = "hello howare you    uuuu";
		int count = 1;
		char[] b = a.toCharArray();
		for (int i = 0; i < b.length; i++) {
			if (b[i] != '0' && b[i] != ' ') {
				count = 1;
				for (int j = i + 1; j < b.length; j++) {
					if (b[i] == b[j]) {
					
					count++;
					b[j] = '0';
					} 
				}
				System.out.println(b[i] + " - " + count);
			}
		}

	}
}

// int count = 1;
// String a = "Welcometogreens";
// char[] val = a.toCharArray();
// for (int i = 0; i < val.length; i++) {
// if (val[i] != '0') {
// count = 1;
// for(int j=i+1;j<val.length;j++) {
// if(val[i]==val[j] ){
// count++;
// val[j]='0';
// }
// }
//
// System.out.println(val[i]+" "+ count);
// }
//
// }
