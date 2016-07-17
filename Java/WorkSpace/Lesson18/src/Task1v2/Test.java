package Task1v2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int numberOfEmployees = 4;
		int numberOfTasks = 11;
		Generator gn = new Generator();
		AllWork itTalents = new AllWork();
		Employee[] employeeList = new Employee[numberOfEmployees];

		Scanner sc = new Scanner(System.in);

		showInfo("Create employees list");
		for (int i = 0; i < employeeList.length; i++) {
			employeeList[i] = gn.generateEmployee();
			employeeList[i].setAllWork(itTalents);
			System.out.println("Employee " + employeeList[i].getName() + " created.");
		}

		showInfo("Create tasks list");
		for (int i = 1; i <= numberOfTasks; i++) {
			itTalents.addTask(gn.generateTask());
		}

		while (!itTalents.isAllWorkDone()) {

			showInfo("Do work");
			for (Employee employee : employeeList) {
				employee.work();

			}

			boolean dayFinished = true;
			showInfo("Check employye hours");
			for (Employee employee : employeeList) {
				System.out.println(
						employee.getName() + "\t:\t" + employee.getHoursLeft() + "\t-\t" + employee.getCurrentTask());
				if (employee.getHoursLeft() > 0 && itTalents.existNextTask()) {
					//
					dayFinished = false;
					break;

				}
			}

			if (dayFinished) {
				showInfo("Press Enter for next day");
				sc.nextLine();

				for (Employee employee : employeeList) {
					employee.startWorkingDay();
				}
				showInfo("NEW WORK DAY STARTED");
			}
		}

		showInfo("ALL TASKS COMPLETED");
	}

	public static void showInfo(String theNote) {
		System.out.println("================================");
		System.out.println("==  " + theNote);
		System.out.println("================================");
	}
}
