package Task9;
public class TestAnimal {
	public static void main(String[] args) {
		
		Animal animals[] = { new Dog(), new Cat(), new Cat() };
		animals[2] = new Bulldog();
		for (int i = 0; i < animals.length; i++) {
			animals[i].makeSomeNoise();
		}
	}
}
