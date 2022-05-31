package hospital_app.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.MedOrder_Dao;
import hospital_app.dto.Encounter;
import hospital_app.dto.Items;
import hospital_app.dto.MedOrder;
import hospital_app.dto.Observation;

public class MedOrderDaoImp implements MedOrder_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		if (encounter != null) {
			entityTransaction.begin();
			medOrder.setEncounter(encounter);
			entityManager.persist(medOrder);
			entityTransaction.commit();
			return entityManager.find(MedOrder.class, medOrder.getId());
		} else {
			return null;
		}
	}

	@Override
	public MedOrder getMedOrderById(int medOrder_id) {
		MedOrder medOrder= entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			return medOrder;
		} else {
			return null;
		}
	}

	@Override
	public List<MedOrder> getMedOrderByEncounterId(int encounter_id) {
		String sql = "Select e from MedOrder e where e.encounter.id= "+encounter_id;
		Query query = entityManager.createQuery(sql);
		List<MedOrder> list = query.getResultList();
		return list;
	}

	@Override
	public MedOrder updateMedOrder(MedOrder medOrder, int medOrder_id) {
		MedOrder medOrder1 = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder1 != null) {
			entityTransaction.begin();
			medOrder1.setId(medOrder_id);
			entityManager.merge(medOrder);
			entityTransaction.commit();

			return entityManager.find(MedOrder.class, medOrder.getId());
		} else {
			return null;
		}
	}

	@Override
	public boolean deleteMedOrder(int medOrder_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);

		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<Items> getItemsByMedOrderId(int medOrder_id) {
		String sql = "Select e from MedOrder e where e.items.id= "+medOrder_id;
		Query query = entityManager.createQuery(sql);
		List<Items> list = query.getResultList();
		return list;
	}

}
