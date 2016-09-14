package factory;

import java.util.ArrayList;

public class Patient extends Person {
	private int age;
	private Gender gender;
	private Doctor doctor;
	private String diagnose;
	private ArrayList<String> drugs;
	private volatile int period;
	private boolean drugsTook;

	public Patient(String name, String phoneNumber, int age, Gender gender, Ward ward) {
		super(name, phoneNumber, ward);
		this.age = age;
		this.drugs = new ArrayList<>();
		this.gender = gender;
		this.drugsTook = false;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}

	public String getDrugs() {
		StringBuilder sb = new StringBuilder();
		for (String str : drugs) {
			sb.append(str);
			sb.append(", ");
		}
		sb.setLength(sb.length() - 2);
		return sb.toString();
	}

	public void setDrugs(String... drug) {
		for (String string : drug) {
			this.drugs.add(string);
		}
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public synchronized int nextDay() {
		if (this.period > 0) {
			this.drugsTook = false;
			return --this.period;
		} else
			return this.period;
	}

	public boolean goHome() {
		return this.period <= 0;
	}

	public int getAge() {
		return age;
	}

	public synchronized boolean takingDrugs() {
		if (!this.drugsTook) {
			this.drugsTook = true;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Patient [age=" + age + ", gender=" + gender + ", doctor=" + doctor + ", diagnose=" + diagnose
				+ ", drugs=" + drugs + ", period=" + period + ", drugsTook=" + drugsTook + ", getDoctor()="
				+ getDoctor() + ", getGender()=" + getGender() + ", getAge()=" + getAge() + ", getFullName()="
				+ getFullName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getWard()=" + getWard() + "]\n";
	}
	
	
}
