package hospital_app.controller.hospital;

import hospital_app.service.Imp.HospitalServiceImp;

public class TestRemoveHospital {
	public static void main(String[] args) {
		HospitalServiceImp hospitalServiceImp = new HospitalServiceImp();
		boolean result = hospitalServiceImp.deleteHospital(3);
		if (result) {
			System.out.println("Hospital deleted");
		} else {
			System.out.println("No hospital exist for this id");
		}
	}
}
