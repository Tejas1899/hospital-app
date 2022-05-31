package hospital_app.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Observation_Dao;
import hospital_app.dto.Encounter;
import hospital_app.dto.Observation;
import hospital_app.dto.Person;

public class ObservationDaoImp implements Observation_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Observation createObservation(Observation observation, int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityTransaction.begin();
			observation.setEncounter(encounter);
			entityManager.persist(observation);
			entityTransaction.commit();
			return entityManager.find(Observation.class, observation.getId());
		} else {
			return null;
		}
	}

	@Override
	public Observation getObservationById(int observation_id) {
		Observation observation = entityManager.find(Observation.class, observation_id);
		if (observation != null) {
			return observation;
		} else {
			return null;
		}
	}

	@Override
	public List<Observation> getObservationByEncounterId(int encounter_id) {
		String sql = "Select e from Observation e where e.encounter.id= "+encounter_id;
		Query query = entityManager.createQuery(sql);
		List<Observation> list = query.getResultList();
		return list;
	}

	@Override
	public Observation updateObservation(Observation observation, int observation_id) {
		Observation observation1 = entityManager.find(Observation.class, observation_id);
		if (observation1 != null) {
			entityTransaction.begin();
			observation1.setId(observation_id);
			entityManager.merge(observation);
			entityTransaction.commit();

			return entityManager.find(Observation.class, observation.getId());
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteObservation(int observation_id) {
		Observation observation = entityManager.find(Observation.class, observation_id);

		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
