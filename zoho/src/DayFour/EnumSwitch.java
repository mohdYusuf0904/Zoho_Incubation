package DayFour;
enum Car {
	
	lamborghini,tata,audi,testla,honda
}



	public class EnumSwitch {
	   public static void main(String args[]){
	      Car c;
	      c = Car.testla;
	      switch(c) {
	         case lamborghini:
	            System.out.println("You choose lamborghini!");
	            break;
	         case tata:
	            System.out.println("You choose tata!");
	            break;
	         case audi:
	            System.out.println("You choose audi!");
	            break;
	         case testla:
	            System.out.println("You choose testla!");
	            break;
	         case honda:
	            System.out.println("You choose honda!");
	            break;
	         default:
	            System.out.println("I don't know your car.");
	            break;
	      }
	   }
	}