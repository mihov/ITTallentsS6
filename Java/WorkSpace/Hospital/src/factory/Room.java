package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Room {
	private Gender genderOcupation;
	private CopyOnWriteArrayList<Patient> beds = new CopyOnWriteArrayList<>();

	public boolean hasEmptyBed() {
		return this.beds.size() < Hospital.BEDS_IN_ROOM;
	}

	public boolean suitableGender(Gender gender) {
		if (this.beds.isEmpty()) {
			return true;
		} else {
			return this.genderOcupation == gender;
		}
	}

	public boolean addPatient(Patient patient) {
		if (hasEmptyBed() && suitableGender(patient.getGender())) {
			if (beds.add(patient)) {
				this.genderOcupation = patient.getGender();
				return true;
			}
		}
		return false;
	}

	/***
	 * 
	 * @param bedNumber
	 *            bed number 1, 2, ...
	 * @return patient at bed number 1, 2, ...
	 */
	public Patient getPatientAtBed(int bedNumber) {
		if (bedNumber > 0 && bedNumber <= Hospital.BEDS_IN_ROOM)
			return this.beds.get(bedNumber - 1);
		else
			return null;
	}

}
