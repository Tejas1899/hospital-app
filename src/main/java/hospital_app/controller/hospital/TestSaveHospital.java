package hospital_app.controller.hospital;

import javax.persistence.ManyToMany;

import hospital_app.dto.Hospital;
import hospital_app.service.Imp.HospitalServiceImp;

public class TestSaveHospital {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("Apollo");
		hospital.setWebsite("www.apollo.com");
		HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
		hospitalServiceImp.saveHospital(hospital);
	}
}
