package factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Hospital {
	public final static int VISITATION_LEN = 1000;
	public final static int DAY_LEN = 5000;
	public final static int ROOMS_IN_WARD = 10;
	public final static int BEDS_IN_ROOM = 3;
	private final static Hospital istance = new Hospital();

	private HashMap<Ward, HashMap<Integer, Room>> rooms;
	private HashMap<Ward, ArrayList<Doctor>> doctors;
	private HashMap<Ward, ArrayList<MedSister>> medSisters;
	private ArrayList<Patient> waitingPatientsList;

	private Hospital() {
		this.rooms = new HashMap<Ward, HashMap<Integer, Room>>();
		this.doctors = new HashMap<Ward, ArrayList<Doctor>>();
		this.medSisters = new HashMap<Ward, ArrayList<MedSister>>();
		this.waitingPatientsList = new ArrayList<Patient>();

		for (Ward ward : Ward.values()) {
			this.doctors.put(ward, new ArrayList<Doctor>());
			this.medSisters.put(ward, new ArrayList<MedSister>());

			this.rooms.put(ward, new HashMap<>(ROOMS_IN_WARD));
			for (int room = 1; room <= ROOMS_IN_WARD; room++) {
				this.rooms.get(ward).put(room, new Room());
			}
		}
	}

	public static Hospital getInstance() {
		return istance;
	}

	public void hireDoctor(String name, String phoneNumber, Ward ward) {
		Doctor doctor = new Doctor(name, phoneNumber, ward, this);
		this.doctors.get(doctor.getWard()).add(doctor);
		System.out.println(doctor + " hired");
	}

	public void hireMedSister(String name, String phoneNumber, int experiance, Ward ward) {
		MedSister medSister = new MedSister(name, phoneNumber, experiance, ward, this);
		this.medSisters.get(medSister.getWard()).add(medSister);
		System.out.println(medSister + " hired.");
	}

	public int availableRoom(Ward ward, Gender gender) {
		for (int room = 1; room <= ROOMS_IN_WARD; room++) {
			if (this.rooms.get(ward).containsKey(room)) {

			} else {

			}
		}

		return -1;
	}

	private void nextDay() {
		for (Ward ward : Ward.values()) {
			for (int room = 1; room <= ROOMS_IN_WARD; room++) {
				for (int bedNumber = 1; bedNumber <= BEDS_IN_ROOM; bedNumber++) {
					Patient patient = this.rooms.get(ward).get(room).getPatientAtBed(bedNumber);
					if (patient != null) {
						patient.nextDay();
					}
				}
			}
		}
	}

	public void startWork(int days) {
		for (Ward ward : Ward.values()) {
			for (Doctor doctor : this.doctors.get(ward)) {
				doctor.start();
			}
			for (MedSister medSister : this.medSisters.get(ward)) {
				medSister.start();
			}
		}

		for (int j = 0; j < days; j++) {
			try {
				Thread.sleep(DAY_LEN);
				nextDay();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public HashMap<Integer, Room> getPatientsList(Person person) {
		if (person instanceof Doctor || person instanceof MedSister) {
			return this.rooms.get(person.getWard());
		}
		return null;
	}

	private Ward wardExaminer(String symptoms) {
		if (symptoms.toLowerCase().indexOf("heart") >= 0) {
			return Ward.CARDIOLOGY;
		}
		if ((symptoms.toLowerCase().indexOf("leg") >= 0) || (symptoms.toLowerCase().indexOf("hand") >= 0)
				|| (symptoms.toLowerCase().indexOf("back") >= 0)) {
			return Ward.ORTOPEDY;
		}
		return Ward.VIRYSOLOGY;
	}
	
	public void printWaitingList(){
		System.out.println(Arrays.toString(this.waitingPatientsList.toArray()));
	}

	public void newPatientArrives(String name, String phoneNumber, int age, Gender gender, String symptoms) {
		Patient newPatient = new Patient(name, phoneNumber, age, gender, wardExaminer(symptoms));
		this.waitingPatientsList.add(newPatient);
	}

}
