package Daily.one;

public class Factorial {
	public static void main(String[] args) {
		int count ;
        int c = 0;
		for (int i = 5; i > 0; i--) {
			count=1;
//			System.out.println(i);
			for (int j = i; j > 0; j--) {
//				System.out.println(j);
     			count = count*j;
     			
     			
			}
			System.out.println("The Factorial value of" +" "+i+" "+count);
			//
			// }
			// ;
		}
	}}