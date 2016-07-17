package task1v1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int numberOfEmployees = 5;
		Generator gn = new Generator();
		AllWork itTalents = new AllWork();
		Employee[] employeeList = new Employee[numberOfEmployees];
		boolean dayFinished = false;
		


		Scanner sc = new Scanner(System.in);

		// Generate tasks
		for (int i = 1; i <= 12; i++) {
			itTalents.addTask(gn.generateTask());
		}

		// Generate employees
		for (int i = 0; i < employeeList.length; i++) {
			employeeList[i] = gn.generateEmployee();
			System.out.println("Employee " + employeeList[i].getName() + " created.");
		}

		System.out.println("==== Work iteration started ==== ");
		while (!itTalents.isAllWorkDone()) {
			System.out.println("==  Tasks share start  ==  ");
			for (Employee employee : employeeList) {
				if (employee.getHoursLeft() > 0)
					employee.setCurrentTask(itTalents.getNextTask());
			}
			System.out.println("==  Tasks share done!  ==  ");

			System.out.println("\n==  Work start  ==  ");

			for (Employee employee : employeeList) {
				employee.work();
			}
			System.out.println("==  Work done  ==  ");

			for (Employee employee : employeeList) {
				if (employee.getCurrentTask() != null) {
					itTalents.addTaskAtTop(employee.returnTask());
				}
			}

			dayFinished = true;
			for (Employee employee : employeeList) {
				if (employee.getHoursLeft() > 0) {
					dayFinished = false;
					break;
				}

			}

			if (dayFinished) {
				System.out.println("================================");
				System.out.println("===  Press Enter for next day ==");
				System.out.println("================================");
				sc.nextLine();
				for (Employee employee : employeeList) {
					employee.startWorkingDay();
				}
				System.out.println("================================");
				System.out.println("===   NEW WORK DAY STARTED   ===");
				System.out.println("================================");
			}
			System.out.println("==== Work iteration ended ==== ");

		}

		System.out.println("================================");
		System.out.println("===   ALL TASKS HAD DONE     ===");
		System.out.println("================================");

		for (Employee employee : employeeList) {
			employee.showHystory();
		}

	}

}
