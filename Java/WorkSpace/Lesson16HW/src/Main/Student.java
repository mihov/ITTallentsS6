/**
 * 
 */
package Main;

/**
 * @author user1
 *
 */
public class Student extends Person {

	private double score;
	
	/**
	 * @param name
	 * @param age
	 * @param iaMale
	 * @param score
	 */
	public Student(String name, int age, boolean iaMale, double score) {
		super(name, age, iaMale);
		this.setScore(score);
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= 2 && score <= 6) {
			this.score = score;
		} else {
			System.out.println("Invalid score!");
		}
	}

	public void showStudentInfo() {
		this.showPersonInfo();
		System.out.println("Score: " + this.score);
	}

}
