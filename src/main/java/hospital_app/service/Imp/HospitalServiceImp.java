package hospital_app.service.Imp;

import java.util.List;

import hospital_app.dao.Imp.HospitalDaoImp;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.Hospital_Service;

public class HospitalServiceImp implements Hospital_Service {

	public Hospital saveHospital(Hospital hospital) {
		HospitalDaoImp dao = new HospitalDaoImp();
		return dao.saveHospital(hospital);
	}

	public Hospital getHospitalById(int id) {
		HospitalDaoImp dao = new HospitalDaoImp();
		return dao.getHospitalById(id);
	}

	public List<Branch> getHospitalBranchesById(int hospital_id) {
		HospitalDaoImp dao = new HospitalDaoImp();
		return dao.getHospitalBranchesById(hospital_id);
	}

	public List<Hospital> getAllHospital() {
		HospitalDaoImp dao = new HospitalDaoImp();
		return dao.getAllHospital();
	}

	public Hospital updateHospital(Hospital hospital, int hospital_id) {
		HospitalDaoImp dao = new HospitalDaoImp();
		return dao.updateHospital(hospital, hospital_id);
	}

	public boolean deleteHospital(int hospital_id) {
		HospitalDaoImp dao = new HospitalDaoImp();
		return dao.deleteHospital(hospital_id);
	}

}
