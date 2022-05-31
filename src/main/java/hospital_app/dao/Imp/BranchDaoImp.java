package hospital_app.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.annotations.ParamDef;

import hospital_app.dao.Branch_Dao;
import hospital_app.dao.Encounter_Dao;
import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;

public class BranchDaoImp implements Branch_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(Branch branch, int hospital_id) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			branch.setHospital(hospital);
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return entityManager.find(Branch.class, branch.getId());
		} else {
			return null;
		}
	}

	public Branch getBranchById(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			return branch;
		} else {
			return null;
		}
	}

	public Hospital getBranchHospitalById(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			Hospital hospital = branch.getHospital();
			return hospital;
		} else {
			return null;
		}
	}

	public List<Branch> getAllBranch() {
		String sql = "Select b from Branch b";
		Query query = entityManager.createQuery(sql);
		List<Branch> branches = query.getResultList();
		if (branches != null) {
			return branches;
		} else {
			return null;
		}
	}

	public List<Branch> getHospitalBranches(int hospital_id) {
		Hospital hospital = entityManager.find(Hospital.class, hospital_id);
		if (hospital != null) {
			List<Branch> branches = hospital.getBranches();
			return branches;
		} else {
			return null;
		}
	}

	public List<Encounter> getBranchEncounters(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			List<Encounter> encounters = branch.getEncounters();
			return encounters;
		} else {
			return null;
		}
	}

	public Branch updateBranch(Branch branch, int branch_id) {
		Branch branch1 = entityManager.find(Branch.class, branch_id);
		entityTransaction.begin();
		entityManager.merge(branch);
		entityTransaction.commit();
		return branch;
	}

	public boolean deleteBranch(int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
