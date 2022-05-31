package hospital_app.controller.branch;

import hospital_app.service.Imp.BranchServiceImp;

public class TestRemoveBranch {
public static void main(String[] args) {
	BranchServiceImp branchServiceImp=new BranchServiceImp();
	boolean result=branchServiceImp.deleteBranch(4);
	if(result) {
		System.out.println("Branch deleted");
	}else {
		System.out.println("Branch not deleted");
	}
}
}
