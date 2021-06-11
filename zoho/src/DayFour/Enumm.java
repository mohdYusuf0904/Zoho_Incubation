package DayFour;


enum season{
	
	winter,summer,spring,fall,
		
	
}
enum Mobile{
	
	nokia(2500){
		void mem() {
			
		}
	},
	samsung(5000)
	{
		void mem() {
			
		}

	},redmi(5600) {
		@Override
		void mem() {
			// TODO Auto-generated method stub
			
		}
	};
	
	
	int price;
	
	Mobile(int t)
	{
		price =t;
	}
	
	int showPrice()
	{
		
		return price;
	}

	
	abstract void mem();
}

//values();
//valueOf();
//ordinal();

public class Enumm {

	public static void main(String[] args) {
		
		for(Mobile m : Mobile.values())
		{
			System.out.println(m);
			System.out.println(m.showPrice());		}
	
	
			season s = season.fall;
			season s3=season.fall;
			System.out.println(s+" "+s3);
			System.out.println();;
			
	}
	
	
	
	
}
