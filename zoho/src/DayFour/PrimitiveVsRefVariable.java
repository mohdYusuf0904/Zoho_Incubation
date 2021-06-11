package DayFour;

import java.util.Arrays;
import java.util.List;

public class PrimitiveVsRefVariable {
	
	public static void main(String[] args) {
		
		int a=3;
		int b=a;
		
		String str="45";
		int s = Integer.valueOf(str);
		System.out.println(s+45);
		
		int ar[]= {2,3,4,5,6};
		int bar[] = ar;
		System.out.println(a+" "+b);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");			
		}
		
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.print(bar[i]+ " ");
		}
		System.out.println("\nAfter Changing");
		a=6;
		ar[1]=23;
		System.out.println(a+" "+b);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+ " ");
			
		}
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.print(bar[i]+ " ");
		}
		
	}
	
}
