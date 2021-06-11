package DayTwo;

public class Vowels {
	
	
	
	
	public static void main(String[] args) {
		
		Vowels v = new Vowels();
		System.out.println(v.doWHile(null));
		System.out.println(v.whilee("vas"));;
	}

	private boolean doWHile(String string) {
		
		int i=0;
		boolean isTrue = false;
		
		do {
			
			
			
			switch(string.charAt(i))
			{
					
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				isTrue=true;
			}
			if(isTrue)
			{
				return isTrue;
			
			}
			i++;
		}while(string.length()>i);
		
			return isTrue;
	}

	private boolean whilee(String string) {
	
		
		int i=0;
		boolean isTrue=false;
		while(string.length()>i) {
			

			switch(string.charAt(i))
			{
					
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				isTrue=true;
			}
			if(isTrue)
			{
				return isTrue;
			
			}
			i++;
			
			
		}
		return isTrue;
		
	}

}
