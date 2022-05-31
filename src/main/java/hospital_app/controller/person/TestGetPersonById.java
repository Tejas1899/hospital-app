package hospital_app.controller.person;

import hospital_app.dto.Person;
import hospital_app.service.Imp.PersonServiceImp;

public class TestGetPersonById {
	public static void main(String[] args) {
		PersonServiceImp personServiceImp = new PersonServiceImp();
		Person person = personServiceImp.getPersonById(8);
		if (person != null) {
			System.out.println("person name is : " + person.getName());
			System.out.println("person age is : " + person.getAge());
			System.out.println("person dob is : " + person.getDob());
			System.out.println("person email is : " + person.getEmail());
			System.out.println("person gender is : " + person.getGender());
			System.out.println("person phone is : " + person.getPhone());

		} else {
			System.out.println("No person exist for that id");
		}
	}
}
