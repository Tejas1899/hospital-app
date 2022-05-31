package hospital_app.dao.Imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_app.dao.Address_Dao;
import hospital_app.dto.Address;
import hospital_app.dto.Branch;
import hospital_app.dto.Hospital;

public class AddressDaoImp implements Address_Dao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	@Override
	public Address saveAddress(Address address, int branch_id) {
		Branch branch = entityManager.find(Branch.class, branch_id);
		if (branch != null) {
			entityTransaction.begin();
			address.setBranch(branch);
			entityManager.persist(branch);
			entityTransaction.commit();
			return entityManager.find(Address.class, address.getId());
		} else {
			return null;
		}
	}

	@Override
	public Branch getBranchByAddressId(int address_id) {
		Address address = entityManager.find(Address.class, address_id);
		if (address != null) {
			Branch branch = address.getBranch();
			return branch;
		} else {
			return null;
		}
	}

	@Override
	public List<Branch> getBranchByCity(String city) {
		String sql = "Select a from Address a where a.city=?1";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, city);
		List<Branch> branches = query.getResultList();
		if (branches != null) {
			return branches;
		} else {
			return null;
		}
	}

	@Override
	public Address updateAddress(Address address, int address_id) {
		Address add=entityManager.find(Address.class,address_id);
		if(add!=null)
		{
			entityTransaction.begin();
			add.setId(address_id);
			entityManager.merge(address);
			entityTransaction.commit();
			
			return entityManager.find(Address.class, address.getId());
		}
		else
		{
			return null;
		}
		
	}
	
	@Override
	public boolean deleteAddress(int address_id) {
		Address address = entityManager.find(Address.class, address_id);

		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
