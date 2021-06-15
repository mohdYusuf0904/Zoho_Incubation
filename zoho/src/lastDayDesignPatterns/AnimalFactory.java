package lastDayDesignPatterns;

public class AnimalFactory {
	
	
	public Animal createAnimal(String petName,String petType) {
		
		
		if(petType.equalsIgnoreCase("dog"))
		{
			return new Dog(petName,petType);
		}else if(petType.equalsIgnoreCase("cat")) {
			
			return new Cat(petName,petType);
		}else {
			
			throw new IllegalArgumentException();
		}
		
	}
	
}
interface Animal{
	
}