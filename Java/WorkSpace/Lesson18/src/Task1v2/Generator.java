package Task1v2;
import java.util.Random;

public class Generator {
	private Random rn;
	private int taskNumber = 1;
	private String[] emplNames = { "Noah", "Olivia", "Ethan", "Ava", "Lucas", "Sophia", "Mason", "Isabella", "Oliver",
			"Mia", "Aiden", "Charlotte", "Elijah", "Harper", "James", "Amelia", "Benjamin", "Abigail", "Logan", "Emily",
			"Jacob", "Madison", "Jackson", "Lily", "Michael", "Ella", "Alexander", "Avery", "Jack", "Evelyn", "Carter",
			"Sofia", "Luke", "Aria", "Owen", "Chloe", "William", "Scarlett", "Daniel", "Riley" };

	public Generator() {
		this.rn = new Random();
		this.taskNumber = 1;
	}

	public Task generateTask() {
		int hours = this.rn.nextInt(23) + 1;
		return new Task("Task " + this.taskNumber++, hours);
	}

	public Employee generateEmployee() {
		int index = this.rn.nextInt(this.emplNames.length);
		int index1 = this.rn.nextInt(this.emplNames.length);
		return new Employee(this.emplNames[index] + " " + this.emplNames[index1]);
	}

}
