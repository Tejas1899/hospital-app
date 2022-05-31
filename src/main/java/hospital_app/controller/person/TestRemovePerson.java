package hospital_app.controller.person;

import hospital_app.service.Imp.PersonServiceImp;

public class TestRemovePerson {
public static void main(String[] args) {
	PersonServiceImp personServiceImp=new PersonServiceImp();
	boolean res=personServiceImp.deletePerson(4);
	if(res) {
		System.out.println("Person deleted");
	}else {
		System.out.println("Person not deleted");
	}
}
}
