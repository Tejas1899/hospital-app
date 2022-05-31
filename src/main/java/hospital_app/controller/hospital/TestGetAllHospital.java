package hospital_app.controller.hospital;

import java.util.List;

import hospital_app.dto.Hospital;
import hospital_app.service.Imp.HospitalServiceImp;

public class TestGetAllHospital {
public static void main(String[] args) {
	HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
	List<Hospital> hospitals = hospitalServiceImp.getAllHospital();
	int count = 1;
	if (hospitals != null) {
		for (Hospital hospital : hospitals) {
			System.out.println("=========================================");
			System.out.println("hospital name is : " + hospital.getName());
			System.out.println("hospital website is : " + hospital.getWebsite());
			System.out.println("hospital id is : " + hospital.getId());
		}
	} else {
		System.out.println("No hospital in DB");
	}
}
}
