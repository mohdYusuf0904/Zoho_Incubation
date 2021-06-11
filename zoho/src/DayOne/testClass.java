package DayOne;

public class testClass {

	public static void main(String[] args) {
	
		Vehicle v = new car();
		
		v.fuelType = "petrol";
		v.model_no=2019;
		v.vehicleType = "car";
		((car)v).seatCount=4;
		((car)v).isAc=false;
		
		System.out.println(v);
	}
}
