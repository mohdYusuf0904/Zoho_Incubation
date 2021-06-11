package DayFour;

public class Vowels {


	
	public static void main(String[] args) {
		
		String str = "happiness is real when you shared";
		
		int c = vowels(str);
		
		if(c!=-1)
		System.out.println("total vowel count " + c);
	}

	private static int vowels(String str) {
		

		int count=0;
		
		str=str.toLowerCase();
		if(str.isEmpty())
		{
			System.out.println("no String present ");
			return -1;
		}else {
			for(int i=0;i<str.length();i++)
			{
				
				switch(str.charAt(i))
				{
				
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
					System.out.println(str.charAt(i));
					break;
				}
				
			}
			
		}
		return count;
	}
	
}
