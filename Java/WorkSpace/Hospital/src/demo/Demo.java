package demo;

import factory.Gender;
import factory.Hospital;
import factory.Ward;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import db.*;

public class Demo {

	public static void main(String[] args) {
		Hospital theHospital = Hospital.getInstance();
		System.out.println("=== Doctors ===");
		theHospital.hireDoctor("Ivan   Ivanov", "0887 123 123", Ward.CARDIOLOGY);
		theHospital.hireDoctor("Vasil Vasilev", "0887 222 222", Ward.ORTOPEDY);
		theHospital.hireDoctor("Petar  Petrov", "0887 333 333", Ward.VIRYSOLOGY);

		System.out.println("\n=== Med Sisters ===");
		theHospital.hireMedSister("Adel Steff", "0888 999 999", 5, Ward.ORTOPEDY);
		theHospital.hireMedSister("Baby Looms", "0888 888 888", 5, Ward.CARDIOLOGY);
		theHospital.hireMedSister("Amyly Boom", "0888 777 777", 5, Ward.VIRYSOLOGY);

		theHospital.newPatientArrives("Patient 1", "111 111 111", 11, Gender.FEMALE, "pain in hand");
		theHospital.newPatientArrives("Patient 2", "222 222 222", 23, Gender.MALE, "pain in back");
		theHospital.newPatientArrives("Patient 3", "333 333 333", 34, Gender.MALE, "pain in heart");
		theHospital.newPatientArrives("Patient 4", "444 444 444", 45, Gender.MALE, "pain in  leg");
		theHospital.newPatientArrives("Patient 5", "555 555 555", 56, Gender.FEMALE, "pain in ass");
		
		theHospital.printWaitingList();
		
		StringBuilder sb = new StringBuilder();
		try {
			Statement st = DBManager.getInstance().getConnection().createStatement();
			ResultSet resultSet = st.executeQuery("SELECT * FROM employees;");
			while(resultSet.next()){
				sb.append(resultSet.getString("first_name"));
				sb.append("\t");
				sb.append(resultSet.getString("last_name"));
				sb.append("\n");
				
//				users.add(new User(	resultSet.getString("username"),
//									resultSet.getString("name"),
//									resultSet.getString("password"),
//									resultSet.getString("email"),
//									resultSet.getString("address")
//									));
			}
		} catch (SQLException e) {
			System.out.println("Oops, cannot make statement.");
			//return users;
		}
		System.out.println(sb.toString());

		//theHospital.startWork(10);
	}

}
