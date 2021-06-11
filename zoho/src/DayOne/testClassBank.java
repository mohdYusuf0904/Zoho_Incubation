package DayOne;

public class testClassBank {

	
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount("Yusuf",2507189,500);
		System.out.println(ba.getBalance());
		System.out.println(ba.getAccNumber());
		ba.withdraw(600);
		ba.withdraw(49);
	}
}

