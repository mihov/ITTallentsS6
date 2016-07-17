package Task1v2;

public class Task {
	private String name;
	private int workingHours;

	public Task(String name, int workingHours) {
		this.setName(name);
		this.setWorkingHours(workingHours);
	}

	public String getName() {
		return name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Working hours can not be negative!");
			this.workingHours = 0;
		}
	}

	private void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		} else {
			System.out.println("Name can not be empty!");
			this.name = "No name";
		}
	}

	@Override
	public String toString() {
		return this.getName() + " : " + this.getWorkingHours()+"h.";
	}

}
