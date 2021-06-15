package lastDayDesignPatterns;

public class petShopp{
	
	Afactory factory ;
	
	public petShopp( Afactory factory)
	{
		this.factory=factory;
		
	}
	
	public static void main(String[] args) {
		
		petShopp shop = new petShopp(new petShopFactory());
		Animal myPet = shop.makeAnimal("kitty","cat");
		System.out.println(myPet);
		
	}

	private Animal makeAnimal(String string, String string2) {
		// TODO Auto-generated method stub
		return factory.makeAnimal(string, string2);
	}
	
}

class petShopFactory implements Afactory{

	@Override
	public Animal makeAnimal(String petName, String petType) {
		

		
		if(petType.equalsIgnoreCase("dog"))
		{
			return (Animal) new Dog(petName,petType);
		}else if(petType.equalsIgnoreCase("cat")) {
			
			return new Cat(petName,petType);
		}else {
			
			throw new IllegalArgumentException();
		}
		
	}
	
	

}

interface Afactory{
	
	Animal makeAnimal(String name,String type);
	
}
