package methodoverloading;

public class condition {
	
	
	public static boolean isVowels(String str)
	{
		
		boolean istrue=false;
		
		for(int i=0;i<str.length();i++)
		{
			
			
			
			
			switch(str.charAt(i))
			{
					
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				istrue=true;
			}
			if(istrue)
			{
				return istrue;
			
			}
			
		}
		
		
			
		return istrue;
}
		
		
	
	
	public static void main(String[] args) {
		

			String str ="yusuf";
			
			System.out.println(isVowels(str));

			
				
	}

}
