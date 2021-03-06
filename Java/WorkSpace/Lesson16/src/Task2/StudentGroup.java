package Task2;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	private final int maxGroupElements = 5;
	private int nextFreePosition;

	private StudentGroup() {
		this.students = new Student[this.maxGroupElements];
		this.freePlaces = this.maxGroupElements;
		this.nextFreePosition = 0;
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
		System.out.println("New group " + this.groupSubject + " has created!");
	}

	public void addStudent(Student s) {
		if (this.nextFreePosition < this.maxGroupElements) {
			if (this.groupSubject.equals(s.getSubject())) {
				this.students[this.nextFreePosition] = s;
				this.nextFreePosition++;
				this.freePlaces--;

				System.out.println(s.getName() + " added to group " + this.groupSubject + ".");
			} else {
				System.out.println("Wrong group!");
			}
		} else {
			System.out.println("No free places in the group.");
		}
	}

	public void emptyGroup() {
		this.students = new Student[this.maxGroupElements];
		this.freePlaces = this.maxGroupElements;
		this.nextFreePosition = 0;
		System.out.println("The group " + this.groupSubject + " has cleared.");
	}

	public Student theBestStudent() {
		int maxStudentPosition = 0;
		double maxGrade = this.students[maxStudentPosition].getGrade();

		for (int i = 1; i < this.nextFreePosition ; i++) {
			if (maxGrade < this.students[i].getGrade()) {
				maxGrade = this.students[i].getGrade();
				maxStudentPosition = i;
			}
		}
		return this.students[maxStudentPosition];
	}

	public void printStudentsInGroup() {
		System.out.println("\nStudents of group "+ this.groupSubject+":");
		System.out.println("|\tNo\t|\tName\t|\tAge\t|\tGrade\t|\tSubject\t|\tMoney\t|\tDegree\t|Year In College|");
		for (int i = 0; i < this.nextFreePosition; i++) {
			System.out.println("|\t"+(i + 1) + ". \t|\t" + 
					this.students[i].getName() + "\t|\t" + 
					this.students[i].getAge() + "\t|\t"+ 
					this.students[i].getGrade() + "\t|\t" + 
					this.students[i].getSubject() + "\t|\t"+ 
					this.students[i].getMoney() + "\t|\t"+ 
					(this.students[i].isDegree()?"Yes":"No") + "\t|\t"+ 
					this.students[i].getYearInCollege() + "\t|");
		}

	}
}
