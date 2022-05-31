package hospital_app.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app.dao.Items_Dao;
import hospital_app.dto.Items;
import hospital_app.dto.MedOrder;

public class ItemsDaoImp implements Items_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Items saveItem(Items item, int medOrder_id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, medOrder_id);
		if (medOrder != null) {
			entityTransaction.begin();
			item.setMedOrder(medOrder);
			entityManager.persist(item);
			entityTransaction.commit();
			return item;
		} else {
			return null;
		}
	}

	@Override
	public Items getItemById(int item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Items> getItemByMedOrderId(int medOrder_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Items updateItem(Items item, int item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteItem(int item_id) {
		// TODO Auto-generated method stub
		return false;
	}

}
