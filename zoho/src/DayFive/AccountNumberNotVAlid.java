package DayFive;

public class AccountNumberNotVAlid extends Exception {


	AccountNumberNotVAlid(String s)
	{
		super(s);
		throw new NumberFormatException();
	}
	
	
	
}
