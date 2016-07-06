package Main;

public class Tests {
	public static Person[] personList = new Person[10];

	public static void main(String[] args) {

		Person p1 = new Person("Ivan", 25, true);
		Person p2 = new Person("Petia", 17, false);

		Student s1 = new Student("Georgi", 16, true, 4.5);
		Student s2 = new Student("Vania", 18, false, 5.5);

		Employee e1 = new Employee("Spas", 33, true, 80);
		Employee e2 = new Employee("Ely", 17, false, 90);

		personList[0] = p1;
		personList[1] = p2;
		personList[2] = s1;
		personList[3] = s2;
		personList[4] = e1;
		personList[5] = e2;

		showList();

		showEmployeeOverTime(5);

	}

	public static void showEmployeeOverTime(double overtime) {

		for (int i = 0; personList[i] != null; i++) {
			if (personList[i] instanceof Employee) {
				System.out.println(((Employee) personList[i]).calculateOvertime(overtime));
			}
		}
	}

	public static void showList() {
		for (int i = 0; personList[i] != null; i++) {
			String className = personList[i].getClass().getTypeName().replaceFirst("Main.", "");
			System.out.print(className + ":");

			switch (className) {
			case "Person":
				personList[i].showPersonInfo();
				break;
			case "Student":
				((Student) personList[i]).showStudentInfo();
				break;
			case "Employee":
				((Employee) personList[i]).showEmployeeInfo();
				break;

			default:
				break;
			}
			System.out.println();
		}
	}
}
