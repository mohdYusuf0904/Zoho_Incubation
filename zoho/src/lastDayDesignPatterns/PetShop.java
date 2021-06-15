package lastDayDesignPatterns;

public class PetShop {

	private static AnimalFactory factory;

	public static void main(String[] args) {
		
		factory = new AnimalFactory();
		Animal pet =  orderedPet("jack","dog");
		System.out.println(pet);
		
	}

	private static Animal orderedPet(String string, String string2) {
		
		return factory.createAnimal(string, string2);
	}

}
