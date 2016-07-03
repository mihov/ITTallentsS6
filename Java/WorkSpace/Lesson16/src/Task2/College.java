package Task2;

public class College {

	public static void main(String[] args) {
		Student stIvan = new Student("Ivan", "Math", 25);
		Student stBoris = new Student("Boris", "Math", 27);
		Student stPetar = new Student("Petar", "Math", 23);

		Student stVasil = new Student("Vasil", "Low", 22);
		Student stKiril = new Student("Kiril", "Low", 30);
		Student stHristo = new Student("Hristo", "Low", 24);

		stIvan.setGrade(4.5);
		stBoris.setGrade(5.5);
		stPetar.setGrade(3.5);

		stVasil.setGrade(5.5);
		stKiril.setGrade(6);
		stHristo.setGrade(3.5);

		StudentGroup sgMath = new StudentGroup("Math");
		sgMath.addStudent(stIvan);
		sgMath.addStudent(stBoris);
		sgMath.addStudent(stPetar);

		StudentGroup sgLow = new StudentGroup("Low");
		sgLow.addStudent(stVasil);
		sgLow.addStudent(stKiril);
		sgLow.addStudent(stHristo);

		sgMath.printStudentsInGroup();
		System.out.print("\nBest grade student is: ");
		System.out.println(sgMath.theBestStudent().getName() + " - " + sgMath.theBestStudent().getGrade());

		sgLow.printStudentsInGroup();
		System.out.print("\nBest grade student is: ");
		System.out.println(sgLow.theBestStudent().getName() + " - " + sgLow.theBestStudent().getGrade());

		sgLow.theBestStudent().upYear();
		System.out.println(sgLow.theBestStudent().receiveScholarship(5.5, 300));
		sgLow.printStudentsInGroup();

		sgLow.theBestStudent().upYear();
		sgLow.theBestStudent().upYear();

		System.out.println(sgLow.theBestStudent().receiveScholarship(5.5, 300));
		sgLow.printStudentsInGroup();

		sgMath.theBestStudent().upYear();
		System.out.println(sgMath.theBestStudent().receiveScholarship(5.5, 300));
		sgMath.printStudentsInGroup();

		sgMath.theBestStudent().upYear();
		sgMath.theBestStudent().upYear();

		System.out.println(sgMath.theBestStudent().receiveScholarship(5.5, 300));
		sgMath.printStudentsInGroup();
		sgMath.theBestStudent().upYear();
		System.out.println(sgMath.theBestStudent().receiveScholarship(5.5, 300));
		sgMath.printStudentsInGroup();
		
		sgMath.emptyGroup();
		sgMath.printStudentsInGroup();
	}

}
