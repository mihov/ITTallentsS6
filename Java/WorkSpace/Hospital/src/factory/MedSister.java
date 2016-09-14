package factory;

import java.util.Map.Entry;

public class MedSister extends Person {
	private int experiance;
	private Hospital hospital;

	public MedSister(String name, String phoneNumber, int experiance, Ward ward, Hospital hospital) {
		super(name, phoneNumber, ward);
		this.experiance = experiance;
		this.hospital = hospital;
	}

	public int getExperiance() {
		return experiance;
	}

	public void givesDrugs() {
		for (int room = 1; room <= Hospital.ROOMS_IN_WARD; room++) {
			for (int bedNumber = 1; bedNumber <= Hospital.BEDS_IN_ROOM; bedNumber++) {
				Patient patientsBed = this.hospital.getPatientsList(this).get(room).getPatientAtBed(bedNumber);
				if (patientsBed != null && patientsBed.takingDrugs()) {
					System.out.println("������ " + this.getFullName() + " ���� �� ������� " + patientsBed.getFullName()
							+ " � ����" + room + " �� ��������� " + this.getWard() + " ��������� "
							+ patientsBed.getDrugs());
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("med sis ").append(this.getFullName()).append("\t").append(this.getWard()).append("\t")
				.append(this.getPhoneNumber()).append("\t").append(this.experiance);
		return builder.toString();
	}

	@Override
	public void run() {
		while (true) {
			givesDrugs();
		}

	}

}
