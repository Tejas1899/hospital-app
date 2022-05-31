package hospital_app.controller.hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.Imp.HospitalServiceImp;

public class TestGetHospitalById {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		Hospital hospital = hospitalServiceImp.getHospitalById(1);
		if (hospital != null) {
			System.out.println("------------------------");
			System.out.println("hospital name is : " + hospital.getName());
			System.out.println("hospital website is : " + hospital.getWebsite());
			System.out.println("hospital id is : " + hospital.getId());

		} else {
			System.out.println("No hospital by id");
		}
	}
}
