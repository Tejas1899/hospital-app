package hospital_app.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Person_Dao;
import hospital_app.dto.Address;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;
import hospital_app.dto.User;

public class PersonDaoImp implements Person_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return entityManager.find(Person.class, person.getId());
	}

	@Override
	public Person getPersonById(int person_id) {
		Person person = entityManager.find(Person.class, person_id);
		if (person != null) {
			return person;
		} else {
			return null;
		}
	}

	@Override
	public List<Encounter> getPersonEncountersByPersonId(int person_id) {
		String sql = "Select p from Person p where p.encounter.id= "+person_id;
		Query query = entityManager.createQuery(sql);
		List<Encounter> list = query.getResultList();
		return list;
	}

	@Override
	public List<Person> getAllPerson() {
		String sql = "Select p from Person p";
		Query query = entityManager.createQuery(sql);
		List<Person> list = query.getResultList();
		return list;
	}

	@Override
	public Person updatePerson(Person person, int person_id) {
		Person person1 = entityManager.find(Person.class, person_id);
		if (person1 != null) {
			entityTransaction.begin();
			person1.setId(person_id);
			entityManager.merge(person);
			entityTransaction.commit();

			return entityManager.find(Person.class, person.getId());
		} else {
			return null;
		}
	}

	@Override
	public boolean deletePerson(int person_id) {
		Person person = entityManager.find(Person.class, person_id);

		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
