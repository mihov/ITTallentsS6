package factory;

public abstract class Person extends Thread{
	
	private String fullName;
	private String phoneNumber;
	private Ward ward;

	public Person(String fullName, String phoneNumber, Ward ward) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.ward = ward;
	}

	public String getFullName() {
		return fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Ward getWard() {
		return ward;
	}

	private void setWard(Ward ward) {
		this.ward = ward;
	}
	
	

}
