package hospital_app.controller.person;

import hospital_app.dto.Person;
import hospital_app.service.Imp.PersonServiceImp;

public class TestUpdatePerson {
public static void main(String[] args) {
	PersonServiceImp personServiceImp=new PersonServiceImp();
	Person person=new Person();
	person.setName("suman");
	person.setAge(26);
	person.setDob("1/25/2005");
	person.setEmail("suman@gmail.com");
	person.setGender("male");
	person.setPhone("110903999");
	
	Person person2=personServiceImp.updatePerson(person,4);
	if(person2!=null) {
		System.out.println("Person updated");
	}
	
	else {
		System.out.println("No person found for that id");
	}
}
}
