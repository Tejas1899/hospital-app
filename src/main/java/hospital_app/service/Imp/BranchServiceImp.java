package hospital_app.service.Imp;

import java.util.List;

import hospital_app.dao.Imp.BranchDaoImp;
import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Hospital;
import hospital_app.service.Branch_Service;
import hospital_app.service.Encounter_Service;

public class BranchServiceImp implements Branch_Service{

	public Branch saveBranch(Branch branch, int hospital_id) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		return branchDaoImp.saveBranch(branch, hospital_id);
	}

	public Branch getBranchById(int branch_id) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		return branchDaoImp.getBranchById(branch_id);
	}

	public Hospital getBranchHospitalById(int branch_id) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		return branchDaoImp.getBranchHospitalById(branch_id);
	}

	public List<Branch> getAllBranch() {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		return branchDaoImp.getAllBranch();
	}

	public List<Branch> getHospitalBranches(int hospital_id) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		return branchDaoImp.getHospitalBranches(hospital_id);
	}

	public List<Encounter> getBranchEncounters(int branch_id) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		return branchDaoImp.getBranchEncounters(branch_id);
	}

	public Branch updateBranch(Branch branch, int branch_id) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		return branchDaoImp.updateBranch(branch, branch_id);
	}

	public boolean deleteBranch(int branch_id) {
		BranchDaoImp branchDaoImp=new BranchDaoImp();
		return branchDaoImp.deleteBranch(branch_id);
	}
	

}
