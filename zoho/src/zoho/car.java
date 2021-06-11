package zoho;



class Engine{
	
	
	private int modelnumber;
	private String type;
	private String powerType;
	
}
public class car extends Vehicle {
	
	public int seatCount;
	boolean isAc;
	Engine engine;
	
	
	

	@Override
	public String toString() {
		
		String res =isAc?"yes":"no";
		
		return "car [seatCount=" + seatCount + ", isAc=" + res + ", vehicleType=" + vehicleType + ", model_no="
				+ model_no + ", fuelType=" + fuelType + "]";
	}
	
	public void wiper() {
		
		System.out.println("clean");
	}

	public void horn() {
		
		
		System.out.println("PAMMM...car horn");
		
	}
	
	

}
