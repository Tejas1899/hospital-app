package hospital_app.controller.branch;

import hospital_app.dto.Branch;
import hospital_app.service.Imp.BranchServiceImp;

public class TestUpdateBranch {
public static void main(String[] args) {
	Branch branch = new Branch();
	branch.setEmail("apollohospitalindranagar@gmail.com");
	branch.setName("apollo hospital indra  nagar");
	branch.setPhone("112289956");

	BranchServiceImp branchServiceImp = new BranchServiceImp();
	Branch branch2 = branchServiceImp.updateBranch(branch, 4);
	if (branch2 != null) {
		System.out.println("Branch updated");
	} else {
		System.out.println("Branch Not found or updated");
	}

}
}
