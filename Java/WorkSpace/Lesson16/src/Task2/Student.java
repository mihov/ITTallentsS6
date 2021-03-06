package Task2;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	public Student() {
		this.grade = 4;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age){
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public boolean isDegree() {
		return isDegree;
	}



	public int getYearInCollege() {
		return yearInCollege;
	}

	public int getAge() {
		return age;
	}

	public double getMoney() {
		return money;
	}

	public void upYear() {
		if (!this.isDegree) {
			this.yearInCollege++;
			if (this.yearInCollege == 4) {
				this.isDegree = true;
				System.out.println("Congrats " + this.name + " has degrree!");
			}
		} else {
			System.out.println(this.name + " allredy degrree!");
		}
	}

	public double receiveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30&&!this.isDegree) {
			this.money += amount;
		}

		return this.money;
	}

}
