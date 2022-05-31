package hospital_app.controller.branch;

import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.service.Imp.BranchServiceImp;

public class TestGetHospitalBranches {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp=new BranchServiceImp();
		List<Branch> branchs=branchServiceImp.getHospitalBranches(1);
		if(branchs!=null) {
			for(Branch branch:branchs) {
				System.out.println(" ================================");
				System.out.println("branch name is : " + branch.getName());
				System.out.println("branch email is : " + branch.getEmail());
				System.out.println("branch phone is : " + branch.getPhone());
				System.out.println("this branch belong to this hospital : " + branch.getHospital().getName());
				System.out.println("this branch belong to this hospital website is : " + branch.getHospital().getWebsite());
			System.out.println("=================================");
			}
		}else {
			System.out.println("No branches available");
		}
	}
}
