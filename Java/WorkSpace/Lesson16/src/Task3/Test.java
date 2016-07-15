package Task3;

public class Test {

	public static void main(String[] args) {
		Task task1 = new Task("Alpha", 10);
		Task task2 = new Task("Bravo", 4);
		
		System.out.println(task1.toString());

		Employee empl1 = new Employee("Ivan");
		Employee empl2 = new Employee("Vania");
		Employee empl3 = new Employee("Stela");

		empl1.setCurrentTask(task1);
		empl2.setCurrentTask(task1);
		empl3.setCurrentTask(task2);

		empl1.showReport();
		
		empl1.work();
		empl1.showReport();
		empl2.work();
		empl2.showReport();
		
		empl3.showReport();
		empl3.work();
		empl3.showReport();
		

	}

}
