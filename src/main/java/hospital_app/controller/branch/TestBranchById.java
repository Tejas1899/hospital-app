package hospital_app.controller.branch;

import hospital_app.dto.Branch;
import hospital_app.service.Imp.BranchServiceImp;

public class TestBranchById {
public static void main(String[] args) {
	BranchServiceImp branchServiceImp = new BranchServiceImp();
	Branch branch = branchServiceImp.getBranchById(13);
	if (branch != null) {
	System.out.println("===========here is detail of branch========");
	System.out.println("branch name is : " + branch.getName());
	System.out.println("branch email is : " + branch.getEmail());
	System.out.println("branch phone is : " + branch.getPhone());
	System.out.println("this branch belong to this hospital : " + branch.getHospital().getName());
	System.out.println("this branch belong to this hospital website is : " + branch.getHospital().getWebsite());
	}
	else {
		System.out.println("Branch not found for that id");
	}
}
}
