package factory;

public class Doctor extends Person {
	private boolean isFree = true;

	private Hospital hospital;

	public Doctor(String name, String phoneNumber, Ward ward, Hospital hospital) {
		super(name, phoneNumber, ward);
		this.hospital = hospital;
	}

	public boolean getFreeStatus() {
		return isFree;
	}


	public void examinatePatient(Patient patient) {

	}

	public void patientsVisitation() {
		

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("D-r ").append(this.getFullName()).append("\t").append(this.getWard()).append("\t")
				.append(this.getPhoneNumber());
		return builder.toString();
	}

	@Override
	public void run() {
		while (true) {
			patientsVisitation();
		}

	}

}
