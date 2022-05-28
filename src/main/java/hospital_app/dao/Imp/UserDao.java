package hospital_app.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.User_Dao;
import hospital_app.dto.User;

 

public class UserDao implements User_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return entityManager.find(User.class,user.getId());
	}

	public User getUserById(int id) {
		User user = entityManager.find(User.class, id);
		if (user != null) {
			return user;
		} else {
			return null;
		}

	}
	

	public List<User> getAllUsers() {
		String sql = "Select u from User u";
		Query query = entityManager.createQuery(sql);
		List<User> list = query.getResultList();
		return list;

	}

	public User validateUser(String email, String password) {
		String sql = "Select u from User u where u.email=?1 and u.password=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User> user = query.getResultList();
		if (user.isEmpty()) {
			return null;
		} else {
			return user.get(0);
		}

	}

	public boolean deleteUserById(int id) {
		User user = entityManager.find(User.class, id);
		boolean res = true;
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return res;
		} else {
			res = false;
			return res;
		}

	}
	
	public User updateUser(User user,int id)
	{
		return user;
	}

}
