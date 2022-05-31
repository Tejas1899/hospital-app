package hospital_app.service.Imp;

import java.util.List;

import hospital_app.dao.Person_Dao;
import hospital_app.dao.Imp.PersonDaoImp;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;
import hospital_app.service.Person_Service;

public class PersonServiceImp implements Person_Service{
	PersonDaoImp daoImp=new PersonDaoImp();
	
	@Override
	public Person savePerson(Person person) {
		return daoImp.savePerson(person);
	}

	@Override
	public Person getPersonById(int person_id) {
		return daoImp.getPersonById(person_id);
	}

	@Override
	public List<Encounter> getPersonEncountersByPersonId(int person_id) {
		return daoImp.getPersonEncountersByPersonId(person_id);
	}

	@Override
	public List<Person> getAllPerson() {
		return daoImp.getAllPerson();
	}

	@Override
	public Person updatePerson(Person person, int person_id) {
		return daoImp.updatePerson(person, person_id);
	}

	@Override
	public boolean deletePerson(int person_id) {
		return daoImp.deletePerson(person_id);
	}

	
}
