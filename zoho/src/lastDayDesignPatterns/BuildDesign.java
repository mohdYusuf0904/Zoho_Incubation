package lastDayDesignPatterns;

public class BuildDesign {

	
	public static void main(String[] args) {
		
		MobileBuilder mob = new MobileBuilder();
		Mobile mobile = mob.setOs("windows").setCamera(25).setScreenSize(12.5).getPhone();
		System.out.println(mobile);
		
	}
	
}

class Mobile{
	

	private String os;
	private String processor;	
	private double screenSize;;
	private int battery;
	private int camera;
	
	public Mobile(String os, String processor, double screenSize, int battery, int camera) {
		super();
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "Mobile [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", battery=" + battery
				+ ", camera=" + camera + "]";
	}
	
	
	 
}


class MobileBuilder{


	private String os;
	private String processor;	
	private double screenSize;;
	private int battery;
	private int camera;
	
	
	public MobileBuilder setOs(String os) {
		
		this.os = os;
		return this;
	}
	public MobileBuilder setProcessor(String processor) {
		this.processor = processor;

		return this;
	}
	public MobileBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;

		return this;
	}
	public MobileBuilder setBattery(int battery) {
		this.battery = battery;

		return this;
	}
	public MobileBuilder setCamera(int camera) {
		this.camera = camera;
		
		return this;
	}

	
	public Mobile getPhone()
	{
		return new Mobile(os, processor, screenSize,battery,camera);
	}
	
}