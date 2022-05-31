package hospital_app.controller.hospital;

import hospital_app.dto.Hospital;
import hospital_app.service.Imp.HospitalServiceImp;

public class TestUpdateHospital {
public static void main(String[] args) {
	Hospital hospital=new Hospital();
	hospital.setName("ganesha hospital");
	hospital.setWebsite("www.ganeshahospital.com");
	
	HospitalServiceImp hospitalServiceImp=new HospitalServiceImp();
	Hospital hospital2=hospitalServiceImp.updateHospital(hospital, 3);
	if(hospital2!=null) {
		System.out.println("hospital is updated based on id of hospital");
	}
	else {
		System.out.println("No hospital for that id");
	}
}
}
