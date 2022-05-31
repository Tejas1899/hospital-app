package hospital_app.dao.Imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dao.Encounter_Dao;
import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.dto.Encounter;
import hospital_app.dto.Person;

public class EncounterDaoImp implements Encounter_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Encounter saveEncounter(int branch_id, int person_id, Encounter encounter) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		Person person = entityManager.find(Person.class, person_id);
		if (branch != null && person != null) {
			entityTransaction.begin();
			encounter.setBranch(branch);
			encounter.setPerson(person);
			entityManager.persist(encounter);
			entityTransaction.commit();
			return encounter;
		} else {
			return null;
		}
	}

	@Override
	public Encounter getEncounterById(int id) {
		Encounter encounter= entityManager.find(Encounter.class, id);
		if (encounter != null) {
			return encounter;
		} else {
			return null;
		}
	}

	@Override
	public Encounter updateEncounter(Encounter encounter, int encounter_id) {
		Encounter enc = entityManager.find(Encounter.class, encounter_id);
		if (enc != null) {
			entityTransaction.begin();
			enc.setId(encounter_id);
			entityManager.merge(encounter);
			entityTransaction.commit();
			
			return entityManager.find(Encounter.class, encounter.getId());
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteEncounter(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);

		if (encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
