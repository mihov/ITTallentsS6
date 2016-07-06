/**
 * 
 */
package Main;

/**
 * @author user1
 *
 */
public class Employee extends Person {
	private double daySalary;
	private double overtime = 1.5;
	private double hoursPerDay = 8;

	/**
	 * @param name
	 * @param age
	 * @param iaMale
	 * @param daySalary
	 */
	public Employee(String name, int age, boolean iaMale, double daySalary) {
		super(name, age, iaMale);
		this.setDaySalary(daySalary);
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		} else {
			System.out.println("Invalid day salary!");
		}
	}

	public double calculateOvertime(double hours) {
		double result = 0;
		if (this.getAge() > 18) {
			result = this.overtime * this.getDaySalary() / this.hoursPerDay * hours;
		}

		return result;
	}
	
	public void showEmployeeInfo(){
		this.showPersonInfo();
		System.out.println("DaySalary: "+this.getDaySalary());
	}

}
