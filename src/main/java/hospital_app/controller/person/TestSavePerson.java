package hospital_app.controller.person;

import hospital_app.dao.Imp.PersonDaoImp;
import hospital_app.dto.Person;

public class TestSavePerson {
public static void main(String[] args) {
	Person person=new Person();
	person.setName("Raj");
	person.setPhone("9986888511");
	person.setGender("Male");
	person.setEmail("raj@mail.com");
	person.setDob("7/7/1977");
	person.setAge(25);
	
	PersonDaoImp daoImp=new PersonDaoImp();
	daoImp.savePerson(person);
}
}
