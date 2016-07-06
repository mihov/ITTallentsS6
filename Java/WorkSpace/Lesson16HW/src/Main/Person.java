/**
 * 
 */
package Main;

/**
 * @author user1
 *
 */
public class Person {

	private final String name;
	private int age;
	private final boolean iaMale;

	/**
	 * @param name
	 * @param age
	 * @param iaMale
	 */
	public Person(String name, int age, boolean iaMale) {
		this.name = name;
		this.age = age;
		this.iaMale = iaMale;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isIaMale() {
		return iaMale;
	}

	public void showPersonInfo() {
		System.out.println("\nName : " + this.name);
		System.out.println("Age  : " + this.age);
		System.out.println("Sex  : " + (this.iaMale ? "Male" : "Fmale"));
	}

}
