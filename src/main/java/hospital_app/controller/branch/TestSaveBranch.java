package hospital_app.controller.branch;

import java.util.ArrayList;
import java.util.List;

import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;
import hospital_app.service.Branch_Service;
import hospital_app.service.Imp.BranchServiceImp;

public class TestSaveBranch {
public static void main(String[] args) {
//	Branch branch1=new Branch();
//	branch1.setName("apollo_basavangudi");
//	branch1.setEmail("apollobas@apollo.in");
//	branch1.setPhone("08023285914");
	
//	Branch branch2=new Branch();
//	branch2.setName("apollo_marathalli");
//	branch2.setEmail("apollomarat@apollo.in");
//	branch2.setPhone("080232887896");
//	
	Branch branch3=new Branch();
	branch3.setName("apollo_rajajinagar");
	branch3.setEmail("apolloraja@apollo.in");
	branch3.setPhone("08023211475");
//	
//	List<Branch> branches=new ArrayList();
//	branches.add(branch1);
//	branches.add(branch2);
//	branches.add(branch3);
//	Hospital hospital;
//	hospital.setBranches(branches);
	
	BranchServiceImp branchServiceImp=new BranchServiceImp();
	Branch branch=branchServiceImp.saveBranch(branch3,1);
	if(branch!=null)
	{
		System.out.println("Branch saved");
	}
	else
	{
		System.out.println("Branch not saved,Hospital id wrong");
	}
}
}
