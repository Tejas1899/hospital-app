package hospital_app.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Hospital_Dao;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public class HospitalDaoImp implements Hospital_Dao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return entityManager.find(Hospital.class, hospital.getId());
	}

	public Hospital getHospitalById(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			return hospital;
		} else {
			return null;
		}
	}

	public List<Branch> getHospitalBranchesById(int hospital_id) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			List<Branch> branches = hospital.getBranches();
			return branches;
		} else {
			return null;
		}
	}

	public List<Hospital> getAllHospital() {
		String sql = "Select h from Hospital h";
		Query query = entityManager.createQuery(sql);
		List<Hospital> hospital = query.getResultList();
		if (hospital != null) {
			return hospital;
		} else {
			return null;
		}
	}

	public Hospital updateHospital(Hospital hospital, int hospital_id) {
		entityTransaction.begin();
		Hospital h = entityManager.find(Hospital.class, hospital_id);
		entityManager.merge(hospital);
		entityTransaction.commit();
		return entityManager.find(Hospital.class, hospital.getId());
	}

	public boolean deleteHospital(int hospital_id) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
