package task2;

public class SIM {
	final private String operator;
	private String gsmNumber;

	public SIM(String vOperator, String vGSMNumber) {
		this.operator = vOperator;
		this.setNumber(vGSMNumber);
	}

	public String getNumber() {
		return this.gsmNumber;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setNumber(String newNumber) {
		if (newNumber.length() == 10 && newNumber.startsWith("08")) {
			this.gsmNumber = newNumber;
		} else {
			this.gsmNumber = "0800000000";
			System.out.println("Can not create SIM card with number " + newNumber + " default number is 0800000000");
		}
	}

}
